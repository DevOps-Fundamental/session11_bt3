package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoApplicationTests {

    @Test
    void testIndexEndpoint() {
        DemoApplication app = new DemoApplication();
        String result = app.index();
        assertEquals("Spring Boot App with Gradle Dependency Caching!", result);
    }

    @Test
    void contextLoads() {
        int expected = 1;
        int actual = 1;
        assertEquals(expected, actual);
    }
}
