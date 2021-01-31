package classesandobjects;

public class getandset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gettersandsetters s1 = new gettersandsetters();
		gettersandsetters s2 = new gettersandsetters();
		
		s1.name = "Vivek";
		s1.setrollnumber(1234);
		
		s2.name = "Ruman";
		s2.setrollnumber(345);
		
		System.out.println("Rollumber set for"+" "+s1.name+" is"+" "+ s1.getrollNumber());
		System.out.println("Rollumber set for"+" "+s2.name+" is"+" "+ s2.getrollNumber());
		
		

	}

}
