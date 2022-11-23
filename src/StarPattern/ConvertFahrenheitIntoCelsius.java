package StarPattern;

import java.util.Scanner;

public class ConvertFahrenheitIntoCelsius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the fah value");
		
		double f = sc.nextDouble();
		
		double a = (f-32)*5/9;
		
		System.out.println(a);
		
		System.out.println("Enter the celsius value");
		
		double cl = sc.nextDouble();
		
		double b = cl*(9/5.0)+32;
		
		System.out.println(b);
	}

}
