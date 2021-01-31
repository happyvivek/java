
object MultipleConstructors {
  def main(args:Array[String]) {
  val p1 = new Person("Steve","Smith",21)
  println(p1)
  
  val p2 = new Person("Adam","Gilchrist")
  println(p2)
  
  val p3 = new Person("David")
  println(p3)
}  
  }

class Person(val fname:String,val lname:String,val age:Int) {
  def this(fname:String) {
    this(fname,"",0)
    println("Calling AC-1")
    }    
  
  def this(fname:String,lname:String) {
      this(fname,lname,0)
      println("Calling AC-2")
    }
  
  override def toString:String = {
   return "%s %s,age %d".format(fname,lname,age)
 }
}