package vehicle

trait HonkTrait extends Vehicle {
  abstract override def honk(): Unit = {print("DUUUUUUUUuuuuuuuuutt")}

  abstract override def startEngine(): Unit = {println("Honking crashed engine")}
}
