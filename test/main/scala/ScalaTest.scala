package main.scala

import main.java.ClassB
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ScalaTest {
  private var b: ClassB = null

  @BeforeEach def beforeEach(): Unit = {
    b = new ClassB
  }

  @Test def testClassB(): Unit = {
    assertEquals(1, b.next)
    assertEquals(2, b.next)
  }

  @Test def testReset(): Unit = {
    assertEquals(1, b.next)
    b.reset()
    assertEquals(1, b.next)
  }
}
