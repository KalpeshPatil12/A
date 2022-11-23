package New;

import java.util.Scanner;

public class EndWithProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start number");
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter end number");
		
		int num2 = sc.nextInt();
		
		for(int i=num1; i<num2; i++)
		{
			if(i%10==7)
			{
				System.out.println("Number ends with 7: "+i);
			}
		}

	}

}
