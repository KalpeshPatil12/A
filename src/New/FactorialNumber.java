package New;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number here");
		
		int num = sc.nextInt();
		
		int fact=1;
		
		for(int i=2; i<=num; i++)
		{
			fact=fact*i;
		
		}
		
		System.out.println("Factorial of the number is:"+fact);

	}

}
