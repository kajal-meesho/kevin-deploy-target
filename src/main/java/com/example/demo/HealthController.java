package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Lightweight health endpoint that Kevin's canary probes hit.
 * <p>
 * Returns 200 with {@code {"status": "UP", "service": "kevin-deploy-target"}}
 * when the container is alive. The Spring Boot Actuator at
 * {@code /actuator/health} also reports liveness — Kevin will check whichever
 * the deployed app exposes.
 */
@RestController
public class HealthController {

    @GetMapping("/")
    public Map<String, String> root() {
        Map<String, String> body = new HashMap<>();
        body.put("service", "kevin-deploy-target");
        body.put("message", "Kevin Week 4 demo target — try /health");
        return body;
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> body = new HashMap<>();
        body.put("status", "UP");
        body.put("service", "kevin-deploy-target");
        return body;
    }
}
