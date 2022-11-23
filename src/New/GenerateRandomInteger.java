package New;

import java.util.Scanner;

public class GenerateRandomInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number of rage: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter the ending number of range: ");
		
		int num2 = sc.nextInt();
		
		int randomNumber = num1 + (int)(Math.random() * ((num2 - num1) + 1));
		
		System.out.println("Rndom number is: "+randomNumber	);

	}

}
