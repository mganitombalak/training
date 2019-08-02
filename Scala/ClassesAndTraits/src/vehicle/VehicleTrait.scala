package vehicle

trait VehicleTrait extends Vehicle {
  val plate: String
  val color: String
  abstract override  def startEngine(): Unit = {
    println(s"${this.plate} car has been started")
  }
  abstract override def stopEngine(): Unit = {
    println(s"${this.plate} car has been stopped")
  }
}
