package New;

import java.util.Arrays;
import java.util.Scanner;

public class Day10_1 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the first String here ");
		
		String s1 = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the secount String here ");
		
		String s2 = sc2.nextLine();
		
		boolean status = true;
		
		if(s1.length() != s2.length())
		{
			status = false;
		}
		else
		{
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if(status)
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}

	}

}
