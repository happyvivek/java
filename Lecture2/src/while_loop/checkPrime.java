package while_loop;

import java.util.*;
public class checkPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divisor=2;
		int check=2;
		while (divisor < num )
		{
			if (num % divisor == 0)
			{
			
				System.out.println("Not Prime");
				return;
			}
			
			divisor=divisor+1;
		}
		
		System.out.println("Prime");

}
	
	
}
