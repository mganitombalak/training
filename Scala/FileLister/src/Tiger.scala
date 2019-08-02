class Tiger(override val name: String) extends Cat(name, true) with Pet {
  override def something(): Unit = {
    println("something in Tiger Class")
  }
}

object Tiger {
  def apply(name: String): Tiger = new Tiger(name)
}
