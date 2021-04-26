package main.scala

object TestObject extends App {
  import main.java.ClassB
  val b = new ClassB
  println(b.next())
}
