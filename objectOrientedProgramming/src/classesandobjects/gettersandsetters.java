package classesandobjects;


//The purpose of getter and setter is we want to bring the class within same package to follow certain conditions.
//Like if somebody is entering roll number less than 0,we want to restrict that.
//We have made the access to rollNumber as private so it cannot be accessed directly by object but indirectly using getter and setter functions.
//You can access private variable within same class only and can be accessed by obj using functions like getters/setter
//Access Modifiers Public/Private/Default
//Default-Class is visible only within the same package,u need to import the class explicitly in 2nd package if u want to use class in pkg 1
//Public -Class is visible to all packages anywhere
//Private-Can be access only within the same class(Even obj within same package can access using getters and setters function.
//getters and setters function is public so can be accessed anywhere

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
