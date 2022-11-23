package New;

import java.util.Scanner;

public class Day10_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year here ");
		
		int year = sc.nextInt();
		
//		if(year%100 == 0)
//		{
//			if(year%400 == 0)
//			{
//		       System.out.println("Year is leap");
//			}
//			else
//			{
//				System.out.println("Year is not leap ");
//			}
//		}
//		else
//		{
			if(year%4 == 0)
			{
				System.out.println("Year is leap ");
			}
			else
			{
				System.out.println("Year is not leap ");
			}
		}

	}
