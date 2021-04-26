import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTestsJava {

    private ClassA counter;

    @BeforeEach
    void beforeEach() {
        counter = new ClassA();
    }

    @Test
    void startsFromZero() {
        assertEquals(0, counter.get());
    }

    @Test
    void incrementsCorrect() {
        counter.increment();
        assertEquals(1, counter.get());
    }

    @Test
    void decrementsCorrect() {
        counter.increment();
        counter.increment();
        counter.decrement();
        assertEquals(1, counter.get());
    }
}
