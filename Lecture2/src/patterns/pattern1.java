package patterns;

import java.util.Scanner;

//print 1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 1;
		while(i <= num ) {
			
			int j = 1;
			
			while(j <= i) {
				
				System.out.print(j);
				j = j + 1;
			}
			
			System.out.println();
			
			i = i + 1;
			
			
		}
				


	}

}
