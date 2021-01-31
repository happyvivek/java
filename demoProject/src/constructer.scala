

object cons extends App {
  
  val obj = new Student(178,34)
  println(obj.calculate())
  
  val obj1 = new Student(188,23,"Vivek")
 
   println(obj1.calculate())
  
}

class Student(var height:Int, var age:Int) {
  
  var name = ""
  
  def calculate(height:Int=height,age:Int=age,name:String=name)={
    
    height*age
    println("My Name is " +name)
   
    
  
  }
  
  def this(height:Int,age:Int,dname:String ) {
    
    this(height,age)
    
    name=dname
    
    
  
}
}