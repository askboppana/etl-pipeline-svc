package com.forgeops;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class WorkerTest {
    @Test void processReturnsResult() {
        Worker w = new Worker("test-worker");
        String result = w.process("hello");
        assertTrue(result.contains("processed"));
        assertTrue(result.contains("hello"));
    }
    @Test void nameIsSet() {
        Worker w = new Worker("my-worker");
        assertEquals("my-worker", w.getName());
    }
}
