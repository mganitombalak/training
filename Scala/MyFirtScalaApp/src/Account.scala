package akbank.objects

class Account(val accountNumber: String, var _balance: Float, val isLocked: Boolean) {
  //println("Hey this class maybe instantiated..")


  def balance = _balance

  def balance_=(newValue: Float): Unit = {
    _balance = newValue
  }

  def this(an: String, b: Float) = this(an, b, false)

  def applyInterest(): Float = {
    this.balance * 1.24F
  }

  def suspendAccount(): Unit = {
    println("Account has been suspended.")
  }

  def *(that: Int) = {this.balance * that}

}

import scala.collection.mutable

object Account {
  private val cache = mutable.Map.empty[String, Float]

  def calculateInterestRate(account: Account): Float = {
    if (cache.contains(account.accountNumber)) {
      cache(account.accountNumber)
    } else {
      val result = account.applyInterest()
      cache += (account.accountNumber -> result)
      result
    }
  }

}
