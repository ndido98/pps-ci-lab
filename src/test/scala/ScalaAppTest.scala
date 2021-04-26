import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.{BeforeEach, Test}

class ScalaAppTest {
  private var counter: C = _

  @BeforeEach
  def initTest(): Unit = {
    counter = new C()
  }

  @Test
  def incrementTest(): Unit ={
    counter.increment()
    assertEquals(1, counter.getCount)
  }
}