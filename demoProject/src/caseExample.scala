object CaseExample {
  def main(args:Array[String]) {
    val s1 = new Patient(20,140)
    val s2 = new Patient(20,140)
  
    if(s1==s2) {
      println("Value Matches")
    }
    else {
      println("Value Does not match")
    }
   }
}

// case class Patient(val age:Int) {
case class Patient(val age:Int,val height:Int) {
}