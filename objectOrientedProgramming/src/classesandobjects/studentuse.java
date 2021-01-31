package classesandobjects;

public class studentuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		//print the memory address of student object
		//classesandobjects.Student@15db9742 hey,this is a student obj present at this memory location
		//non-premitive data types stores address location
		//new Student created as student object for you and s1 is variable for non primitive data type so stores the address of this student class object.
		//so basically it creates 2 address spaces 1. object memory location and other s1 which stores the address of this memory location of obj.
		//you don't need to import class if its within same package else you have to import
		System.out.println(s2);
		s1.name = "vivek";
		s1.rollNumber = 1984;
		
		s2.name = "ruman";
		s2.rollNumber = 1985;
		
		System.out.println(s1.name+" "+s2.name+" "+s1.rollNumber+" "+s2.rollNumber);
		
				
				
		
		
		

	}

}
