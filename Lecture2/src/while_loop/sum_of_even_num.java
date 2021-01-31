package while_loop;

import java.util.Scanner;

//Given a number N, print sum of all even numbers from 1 to N.

public class sum_of_even_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int i=1;
		int sum=0;
		while ( i <= num) {
			if (i % 2 == 0)
				
			{
				sum = sum + i;
				//i = i + 1;
				
				
				
			}
			
			i=i+1;
				
			
		}
		
		System.out.println(sum);
		System.out.println(sum);
		
		


	}

}
