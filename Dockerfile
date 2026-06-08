# Kevin Week 4 deploy target — multi-stage Dockerfile.
# Stage 1: build the fat JAR inside a Maven container.
# Stage 2: copy the JAR into a slim JRE image for runtime.
# Kevin's DockerLocalDeployClient builds and runs this image as the canary.

# ---- build stage ----
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /workspace
COPY pom.xml ./
# Resolve dependencies first so Docker layer-caches them
RUN mvn -B -q dependency:go-offline
COPY src ./src
RUN mvn -B -q -DskipTests package

# ---- runtime stage ----
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /workspace/target/kevin-deploy-target.jar /app/app.jar

# Listen on 8080 inside the container. Kevin maps this to a localhost port
# from its configured range (18100–18199).
EXPOSE 8080

# Minimal sanity: a HEALTHCHECK so docker ps shows the container state cleanly.
HEALTHCHECK --interval=10s --timeout=3s --start-period=20s \
  CMD wget -qO- http://localhost:8080/health || exit 1

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
