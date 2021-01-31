class Item(var price:Double,var description:String) {
  override def toString():String = {
    description + "Cost: " + discountedPrice
  }
  
  def discountedPrice():Double = {
    price
  }
}

class SpecialItem(price:Double,description:String,discountPercent:Int) extends Item(price,description) {
  override def discountedPrice():Double = {
      // (price - ((discountPercent/100)*price))
      price-(discountPercent*price/100)
      
  }
}

object Inheritance {
  def main(args:Array[String]):Unit = {
    val item = new Item(100,"Book")
    println(item)
  
    val specialItem = new SpecialItem(100,"New Book",10)
    println(specialItem)
  }
  
} 

