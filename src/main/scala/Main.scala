object Main extends App {
    val counter: ClassA = new ClassA

    println(counter.get())
    counter.increment()
    println(counter.get())
}