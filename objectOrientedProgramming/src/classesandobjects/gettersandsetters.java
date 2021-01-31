package classesandobjects;


//The purpose of getter and setter is we want to bring the class within same package to follow certain conditions.
//Like if somebody is entering roll number less than 0,we want to restrict that.


public class gettersandsetters {
	
	
	String name;
	private int rollNumber;
	
	public void setrollnumber(int rn) {
		if (rn <= 0) {
			return;
		}
		
		rollNumber = rn;
      		
	}
	
	public int getrollNumber() {
		
		return rollNumber;
	}

	
	
}
