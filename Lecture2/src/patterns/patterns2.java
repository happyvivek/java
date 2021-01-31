package patterns;

import java.util.Scanner;

//print   1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
public class patterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 1;
		int k=1;
		while(i <= num ) {
			
			int j = 1;
			
			
			while(j <= i) {
				
				System.out.print(k);
				k = k + 1;
				j = j + 1;
			}
			
			System.out.println();
			
			i = i + 1;
			
			
			
		}
				


	}

}
