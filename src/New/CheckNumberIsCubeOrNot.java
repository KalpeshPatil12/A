package New;

import java.util.Scanner;

public class CheckNumberIsCubeOrNot {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number here");
		
		int num = sc.nextInt();
		
		int n = (int) Math.round(Math.pow(num, 1.0/3.0));
		//int n = 0;
		
		if((num == n * n * n))
		{
			System.out.println("Given number is cube");
		}
		else
		{
			System.out.println("Number is not cube");
		}
		
		
		
		
		
	}

}
