object ReservationCounter extends App {
  private var lastNum = 0
  
  def generateReservationNumber():Int = {
    lastNum = lastNum + 1
    return lastNum
    
  }
  for (i <- 1 to 3) {
    val a = generateReservationNumber()
    println(a)
  }  
}


