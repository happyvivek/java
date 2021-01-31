package patterns;

import java.util.Scanner;

//print            1
//               1 2
//             1 2 3
//           1 2 3 4
//         1 2 3 4 5

//ith row n-1 spaces
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int i=1;
		int val=1;
	while (i <= num )
	{
		int space = 1;

	while (space <= num-i) {
		
		System.out.print("a");
		
		
		space=space+1;
		
	}
		int j=1;
		while (j <= i)
		{
			System.out.print(val);
			val = val+1;
			j=j+1;
		}
		
	
	
	
	System.out.println();
		i=i+1;

	}
	}

}

