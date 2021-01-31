object CompanionExample extends App {
  var s1 = new CompanionExample()
  println("Name created"+ " " +s1.name)
  s1.provider()
  println("Age created"+ " " +s1.age)
}

class CompanionExample {
  private var name = "Edu" // Alaways initialize it
  private var age = 0
  private def provider() = {
  age = 50
  }
}