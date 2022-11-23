package New;

import java.util.Scanner;

public class Day5_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number here");
		
		int row = sc.nextInt();
		
		System.out.println("Here the number");
		
		for(int i=2; i<=row; i++)
		{
			int count = 0;
			
			for(int j=2; j<i; j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			   if(count == 0)
			   {
				   System.out.println(i+" ");
			   }
		}

	}

}
