class Cat(override val name:String,val dangerous: Boolean = false) extends Animal(name) {
  override def something(): Unit = {
    println("something in cat")
  }
}
