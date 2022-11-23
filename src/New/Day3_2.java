package New;

import java.util.Scanner;

public class Day3_2 {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		 
//		System.out.println("Enter String :- ");
//		
//		String str=sc.nextLine();
//		
//		String rev="";
//		
//		int len=str.length();
//		
//		for(int i=len-1; i>=0; i--)
//		{
//			rev=rev+str.charAt(i);
//		}
//		
//		if(str.equals(rev))
//		{
//			System.out.println("String is Palindrome String");
//		}
//		else
//		{
//			System.out.println("String is not Palindrome String");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String here");
		
		String str = sc.nextLine();
		
		String rev = "";
		
		int len=str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		//System.out.println(rev);
		
		if(str.endsWith(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
}
