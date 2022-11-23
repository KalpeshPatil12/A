package New;

import java.util.Scanner;

public class CalculateSimpleIntrest {

	public static void main(String[] args) {
		
		float p, r, t, simpleIntrest;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle ammount ");
		
		p = sc.nextFloat();
		
		System.out.println("Enter the rate of intrest ");
		
		r = sc.nextFloat();
		
		System.out.println("Enter the time period ");
		
		t = sc.nextFloat();
		
		sc.close();
		
		simpleIntrest = (p * r * t) / 100;
		
		System.out.println("Simple intrest is :"+simpleIntrest);
		

	}

}
