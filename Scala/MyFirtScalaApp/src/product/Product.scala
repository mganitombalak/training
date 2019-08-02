package product

class Product(private var _name: String, val price: Float) {

  def name = _name

  def name_=(newValue: String) = {
    _name = newValue
  }
  override def toString: String = this.name
}

object Product{
  def apply (name:String,price:Float):Product = new Product(name,price)
}