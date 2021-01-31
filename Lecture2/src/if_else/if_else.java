
package if_else;

import java.util.*;

public class if_else {

	

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		char ch = scan.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z')
		{
			System.out.println("1");
			
		} else if (ch >= 'a' && ch <= 'z')
		
		{
		System.out.println("0");

	} else {
			System.out.println("-1");

}
	
	}
}
