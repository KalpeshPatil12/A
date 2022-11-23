package New;

import java.util.Scanner;

public class PerfectOrNot {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter no : ");
		
		int n=in.nextInt();
		
		int sum=0;
		
		for(int i = 1; i < n; i++)
		{
		if(n % i == 0)
		{
		sum = sum + i;
		}
		}
		if(sum == n)
		{
		System.out.println("The number "+n+" is Perfect");
		}
		else
		{
		System.out.println("The number "+n+" is not Perfect");
		}  

	}

}
