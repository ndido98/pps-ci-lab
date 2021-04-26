import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CTest {
    private C counter;

    @BeforeEach
    private void initTest() {
        counter = new C();
    }

    @Test
    public void incrementTest() {
        counter.increment();
        assertEquals(1, counter.getCount());
    }

    @Test
    public void resetTest() {
        counter.increment();
        counter.increment();
        assertEquals(2, counter.getCount());
        counter.reset();
    }
}
