package Basic;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		
		char operator;
		
		int num1, num2, result;
		
		Scanner sc=new Scanner(System.in);
		
		// First Number
	    System.out.println("Enter first number ");
		num1=sc.nextInt();
		
		// select sign
		System.out.println("Select operator");
		operator=sc.next().charAt(0);
		
		// Secound Number 
		System.out.println("Enter secount number ");
		num2=sc.nextInt();
		
		System.out.println("Result :- ");
		
		switch(operator) {
		
		case '+':
			result=num1+num2;
			System.out.println(result);
			break;
			
		case '-':
			result=num1-num2;
			System.out.println(result);
			break;
			
		case '*':
			result=num1*num2;
			System.out.println(result);
			break;
			
		case '/':
			result=num1/num2;
			System.out.println(result);
			break;
			
		default :
			System.out.println("Select operator");
		}
		
		
		

	}

}
