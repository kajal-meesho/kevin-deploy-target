package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Spring Boot smoke test — verifies the application context loads cleanly.
 * If a future Kevin-authored change accidentally breaks bean wiring, this fails.
 */
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // Empty body: the assertion is that the @SpringBootApplication
        // context starts up without throwing.
    }
}
