import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.math.{BigInt, _}
import scala.util.{Failure, Random, Success}

object main {
  def main(args: Array[String]): Unit = {
    //    var f = Future[Int] {
    //      Thread.sleep(Random.nextInt(500))
    //      5 / 0
    //    }
    //    println(s"Our future is ${f.isCompleted}")
    //    f.onComplete {
    //      case Success(value) => println(value)
    //      case Failure(exception) => println(exception.getMessage)
    //    }

    //    f.onSuccess{case result =>println(result)}
    //    f.onFailure{case err =>println(err.getMessage)}

    //    println(s"Our future is ${f.isCompleted}")
    //    Thread.sleep(2000)
    //
    //    def calculate(x: Int, y: Int): Future[Int] = Future {
    //      x + y
    //    }
    //
    //    def calculate2(x: Any)(operation: Any =>Any) = Future {
    //      operation(x)
    //    }
    //    val a = "Elif"
    //    var myfuture = calculate2(a) {
    //      x =>
    //        x match {
    //          case p: Int => p * 2
    //          case p: String => p.length.toString
    //        }
    //    } re
    //
    //    calculate(5, 7).onComplete {
    //      case Success(v) => println(v)
    //      case Failure(err) => println(err.getMessage)
    //    }
    //    Thread.sleep(2000)

    def factorial(i: BigInt): BigInt = if (i == 0) BigInt(1) else i * factorial(i - 1)
    var startTime = System.nanoTime()
    var result = factorial(34)
    var elapsedTime = (System.nanoTime() - startTime) / 1E9D
    print(s"The result: $result is yielded in $elapsedTime ms")

  }
}
