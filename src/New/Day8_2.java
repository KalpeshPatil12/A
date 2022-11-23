package New;

import java.util.Scanner;

public class Day8_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number here");
		
		int num = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		
		while(num>0)
		{
			sum = sum+num%10;
			num = num/10;
			count++;

		}
		
		System.out.println("Count of number is "+count);
		
		System.out.println("Sum of number is "+sum);
		

	}

}
