import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CounterTestsScala {
    val counter = new ClassA()

    @Test
    def startsFromZero(): Unit = {
        assertEquals(0, counter.get())
    }

    @Test
    def incrementsCorrect(): Unit = {
        counter.increment()
        assertEquals(1, counter.get())
    }

    @Test
    def decrementsCorrect(): Unit = {
        counter.increment()
        counter.increment()
        counter.decrement()
        assertEquals(1, counter.get())
    }
}
