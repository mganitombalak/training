package product

class Installment(val installmanet:Int,val ratio:Float) {
}

object Installment{
  def apply(installmanet: Int, ratio: Float): Installment = new Installment(installmanet, ratio)
}
