package Basic;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {

		
		char z;
		
		int a, b, result;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value");
		a=sc.nextInt();
		
		System.out.println("Choose operator +, -, *, /");
		z=sc.next().charAt(0);
		
		System.out.println("Enter b value");
		b=sc.nextInt();
		
		switch(z)
		{
			case '+':
				result=a+b;
				System.out.println(result);
				break;
				
			case '-':
				result=a-b;
				System.out.println(result);
				break;
				
			case '*':
				result=a*b;
				System.out.println(result);
				break;
				
			case '/':
				result=a/b;
				System.out.println(result);
				break;
				
			default:
				System.out.println("Invalid operator");
		}
		

	}

}
