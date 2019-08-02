package akbank.implicits

import akbank.objects.Account

object AkbankImplicits {
  implicit def accountToFloat(a: Account) = a.balance
}