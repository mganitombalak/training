package vehicle

class Car(override val plate: String, val color: String) extends Vehicle(plate) {

  override def startEngine(): Unit = println("Car Class: Car has been started.")

  override def stopEngine(): Unit = println("Car Class: Car has been stopped")

  final override def honk(): Unit = {println("DIIIIIIIIIIIIuiiiiiiiit")}
}

//object Car {
//  def apply(plate: String, color: String): Car = new Car(plate, color)
//}