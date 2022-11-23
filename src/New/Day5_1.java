package New;

import java.util.Scanner;

public class Day5_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number here");
		
		int row = sc.nextInt();
		
		System.out.println("here the pattern");
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
