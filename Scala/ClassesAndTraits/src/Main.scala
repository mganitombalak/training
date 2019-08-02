import vehicle.{Car, HatchbackCar, HonkTrait, Vehicle, VehicleTrait}

object Main {
  def main(args: Array[String]): Unit = {

    //def calculate(x: Int, op: Int => Int): Int = op(x)
    //    val constant:Double=1.35
    //
    //    def calculate(x: Int)(op: Int => Double): Double = op(x);
    //
    //    Console println calculate(3) { x => x * constant }
    //    val c = Car("34ABC123", "Red") //with VehicleTrait with HonkTrait
    //    //    c.startEngine
    //    //    c.stopEngine
    //    //    c.honk()
    //    //    println(c.plate)
    //    //    println(c.color)

    //    val hc = HatchbackCar("34DEF456", "Antrasit Blue")

    class Animal(val name: String)
    case class Bird(override val name: String) extends Animal(name)
    case class Dog(override val name: String) extends Animal(name)

    var animalList = List(Bird("Twitty"), Dog("Karabas"), (1, "Gani"), (0, "Not Valid", "+901234567890"))

    animalList.foreach(x => x match {
      case Bird(name) => println(s"it is a bird ${name}")
      case Dog(name) => println(s"it is a dog ${name}")
      case (0, _, n) => println(s"SMS Api called again with number ${n}")
      case List(_, _, 3, _*) =>
      case _ => println("it is not an animal")
    })

    def convertToInt(s: String): Option[Int] = {
      try {
        Some(Integer.parseInt(s))
      } catch {
        case e: Exception => None
      }
    }

    convertToInt("abs") match {
      case Some(_) => println("Yay!It is a number!")
      case None => println(":(")
    }




  }

}
