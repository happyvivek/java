package classesandobjects;


//Constructor is a special method that is called when an object
//is instantiated i.e created. It is used to initialize an object. Its name is same as
//the class name. Even though in the above vehicle example we haven’t created
//an explicit constructor there is a default constructor implicitly there. We can
//create our own constructor as well. Also we can define multiple constructors
//in a class as well

public class constructeruse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructerclass s1 = new constructerclass(1234,"viveksingh");
		s1.print();
		System.out.println(s1.name +":"+ s1.rollNumber);

	}

}
