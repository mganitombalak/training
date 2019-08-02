import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import javax.management.NotificationFilter

import scala.runtime.Nothing$

object main extends App {

  // CREATE ACTOR SYSTEM
  val actorSystem = ActorSystem("MyFirstActorSystem")
  println(actorSystem.name)

  //CREATE ACTOR
  //  class WordCount extends Actor {
  //    var count = 0
  //    def receive: Receive = {
  //      case "gani" => println("Nbr bro!")
  //      case message: String => {
  //        count = message.split(" ").length
  //        println(s"[WordCount Actor]: A message received:$message = $count")
  //      }
  //      case _ => println("I can't understand what you mean!")
  //    }
  //  }
  // INITIALIZE ACTOR AND.
  //  val wordCountActorRef = actorSystem.actorOf(Props[WordCount],"WordCountActor")
  //  val anotherActorRef = actorSystem.actorOf(Props[WordCount],"WordCountActor2")
  //  // SEND MESSAGE TO ACTOR!
  //  wordCountActorRef ! "Mehmet Gani Tombalak"
  //  anotherActorRef ! "Mesut Yalcin"
  //  wordCountActorRef ! 2
  //  anotherActorRef ! "gani"
  //  trait Notification
  //  case class SMSNotification(number: String, message: String) extends Notification
  //  case class EMailNotification(from: String, to: String, body: String) extends Notification
  //  class Sender extends Actor {
  //    override def receive: Receive = {
  //      case SMSNotification(number, message) =>
  //        {
  //          println(s"${context.self} = SMS:'$message' will be sent to:$number ")
  //          self ! "SMSSent"
  //        }
  //      case EMailNotification(from, to, body) => {
  //        println(s"${context.self} =Email:'$from' -> '$to' will be sent with $body")
  //        self ! "EmailSent"
  //      }
  //      case "SMSSent"=> println("SMS has been delivered!")
  //      case "EmailSent" =>println("Email has been delivered!")
  //    }
  //  }

  //  var l: List[Notification] =
  //  SMSNotification("09876543", "Dear customer you won free GBs") ::
  //    SMSNotification("345678434", "Dear customer you won free GBs") ::
  //    EMailNotification("gani", "kubilay", "hello world!") ::
  //    EMailNotification("kursat", "riza", "hey riza will you join us") :: Nil
  //  l.foreach(m => {
  //    actorSystem.actorOf(Props[Sender], s"sender${System.nanoTime()}") ! m
  //  })

  case class Reply(body:String)
  case class Message(body:String)

  object Message {
    case object Relayed
    case object Declined
  }

  class MessageSender(to: ActorRef) extends Actor {
    import Message._
    override def receive: Receive = {
      case Message(m) => {
        println(s"$self : $m")
        to ! to
        self ! Relayed
      }
      case Reply(replyBody)=>println(replyBody)
      case Declined => println("Message has been declined!")
      case Relayed => println("Message has beem relayed!")
    }
  }

  class MessageClient extends Actor {

    import Message._

    override def receive: Receive = {
      case m: String => {
        println(s"$self : $m")
        sender ! "OOO kursat beyler de burdaymis"
        self ! Relayed
      }
      case Declined => println("Message has been declined!")
      case Relayed => println("Message has beem relayed!")
    }

    override def postStop(): Unit = {
      println(s"$self has been stopped.")
    }
  }

  var gani = actorSystem.actorOf(Props[MessageClient], "gani")
  var kursat = actorSystem.actorOf(Props(new MessageSender(gani)), "kursat")

  var message = "Hello Gani!"
  kursat ! message
}