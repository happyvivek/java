package classesandobjects;

public class constructerclass {
	
	public int rollNumber;
	String name;

	//Custom constructor 
	public constructerclass(int rn,String n) {
		
		name = n;
		rollNumber = rn;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name +":" + rollNumber);
		
	}
	
	

}
