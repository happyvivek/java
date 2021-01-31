package classesandobjects;


//The purpose of getter and setter is we want to bring the class within same package to follow certain conditions.
//Like if somebody is entering roll number less than 0,we want to restrict that.
//We have made the access to rollNumber as private so it cannot be accessed directly by object but indirectly using getter and setter functions.
//You can access private variable within same class only and can be accessed by obj using functions like getters/setter


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
