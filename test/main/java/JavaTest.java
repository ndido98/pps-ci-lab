package main.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTest {
    private ClassB b;

    @BeforeEach
    public void beforeEach() {
        b = new ClassB();
    }

    @Test
    public void testClassB() {
        assertEquals(1, b.next());
        assertEquals(2, b.next());
    }

    @Test
    public void testReset() {
        assertEquals(1, b.next());
        b.reset();
        assertEquals(1, b.next());
    }
}
