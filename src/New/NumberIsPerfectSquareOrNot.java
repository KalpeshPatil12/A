package New;

import java.util.Scanner;

public class NumberIsPerfectSquareOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");   
		
		int num=sc.nextInt() ;  
		
		if (perfectSquare(num))  
		{
			System.out.println("Given number is square"); 
		} 
		
		else 
		{
			
		System.out.print("Given number is not square");  
		
		}
	}
		   
		static boolean perfectSquare(int num)   
		{   
		for (int i=1; i*i<=num; i++)   
		{   
		   if((num%i==0) && (num/i==i))   
		{        
		   return true;   
		}   
		}    
		   return false;   
		}   
	

	}


