package vehicle

abstract class Vehicle(val plate: String) {

  def startEngine(): Unit = {
    println("Vehicle has been started")
  }

  def stopEngine(): Unit = {
    println("Vehicle has been stopped")
  }

  def honk() {println("DAAAAAaaaaat")}
}
