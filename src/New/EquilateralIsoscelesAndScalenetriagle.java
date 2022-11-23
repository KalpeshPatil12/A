package New;

import java.util.Scanner;

public class EquilateralIsoscelesAndScalenetriagle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first side here");
		
		int s1 = sc.nextInt();
		
		System.out.println("Enter the secount side here");
		
		int s2 = sc.nextInt();
		
		System.out.println("Enter the third side here");
		
		int s3 = sc.nextInt();
		
		if((s1+s2<s3) || (s2+s3<s1) || (s3+s2<s1))
		{
			System.out.println("Triangle format");
		}
		
		if(s1==s2 &&  s2==s3 && s3==s1)
		{
			System.out.println("Triangle is Equilateral");
		}
			
		else if((s1==s2) || (s2==s3) || (s3==s1))
		{
			System.out.println("Triangle is Isoscels");
		}
		
		else
		{
			System.out.println("Triangle is Scanlene");
		}

	}

}
