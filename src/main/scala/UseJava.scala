package main.scala

object TestObject {
  import main.java.ClassB
  val b = new ClassB
  println(b.next())
}
