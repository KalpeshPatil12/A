package StarPattern;

import java.util.Scanner;

public class PatternApp2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string here");

		String str = sc.nextLine();

		System.out.println("Printing the pattern");

		for (int i = 1; i <= str.length(); i++)
	        {

		for (int j = str.length(); j > i; j--)

	       {

		System.out.print(" ");

	       }

		for (int k = i * 2 - 1; k >= 1; k--)

	       {

		System.out.print(str.charAt(i - 1));

	       }

		System.out.println("");

	     }

	   }

}
