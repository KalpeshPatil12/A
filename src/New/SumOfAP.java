package New;

import java.util.Scanner;

public class SumOfAP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, d, n, tn;
		int sum = 0;
		
		System.out.println("Enter the first number of A.P series");
		a=sc.nextInt();
		
		System.out.println("Enter the total number of A.P series");
		n=sc.nextInt();
		
		System.out.println("Enter the common difference of A.P series");
		d=sc.nextInt();
		
		sum = (n * (2 * a + (n - 1) * d)) / 2;
		
		tn = a + (n - 1) * d;
		
		System.out.print("Sum of the series A.P : ");
		
		for(int i=a; i<=tn; i=i+d)
		{
			if(i != tn)
			{
				System.out.print(i + "+");
			}
			else
			{
				System.out.print(i + "="+sum+"");
			}
		}
		
		

	}

}
