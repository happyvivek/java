import java.util.*;
public class averageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		char name = Scan.next().charAt(0);
		
		int m1 = Scan.nextInt();
		int m2 = Scan.nextInt();
		int m3 = Scan.nextInt();
		
		
		
		int average = (m1+m2+m3)/3;
		System.out.println(name);
		System.out.println(average);
		
		
		
		
		

	}

}
