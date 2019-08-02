import akbank.objects.Account
import product.{Installment, Product}

object MyFirstScalaApp {
  def main(args: Array[String]): Unit = {
    val a = new Account("1", 50F)
    val b = new Account("2", 20F)
    var bal = a.balance
    a applyInterest()
    b applyInterest()
    a suspendAccount()
    b suspendAccount()
    if (true) {
      import akbank.implicits.AkbankImplicits.accountToFloat
      println(2 * a)
      print(a * 2)
    }

    //    var productList = List(
    //      Product("Mp3 Player", 23.45F),
    //      Product("Mobile Phone", 299.99F),
    //      Product("Playsation", 440.50F),
    //      Product("XBox", 398.70F),
    //      Product("Oculus Rift VR", 999.99F))
    //
    //    var installment = scala.collection.mutable.Map[Int, Float]()
    //    installment += (2 -> 0F)
    //    installment += (3 -> 0F)
    //    installment += (6 -> 2F)
    //    installment += (12 -> 2F)
    //
    //    println("Name\tPrice (Raw)\tPrice(With Installment)")
    //    productList.filter(p => p.price > 400).map(
    //      p => (p.name,p.price, p.price * installment(12))
    //    ).foreach(v=>{
    //      println(v._1 +"\t"+v._2+"\t"+v._3)
    //    });
  }
}