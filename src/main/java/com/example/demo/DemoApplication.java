package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Kevin Week 4 deploy target — main entry point.
 * <p>
 * Spins up an HTTP server on port 8080 with:
 *   • GET /            — basic info
 *   • GET /health      — application health (added by {@link HealthController})
 *   • GET /actuator/health — Spring Boot Actuator's deeper health probe
 *
 * The canary deploy client builds this into a Docker image, runs it as a
 * container, and probes the health endpoints. The evaluator agent watches
 * the metrics that come out of these probes.
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
