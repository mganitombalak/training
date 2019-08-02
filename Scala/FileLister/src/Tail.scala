trait Tail extends Animal {
  def shakeTail {
    println(s"${this.name} is shaking its tail")
  }

  def stopShakingTail {
    println(s"${this.name} has been stopped shaking its tail")
  }

  abstract override def something {
    println("something in Tail Trait")
  }
}
