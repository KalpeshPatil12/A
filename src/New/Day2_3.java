package New;

import java.util.Scanner;

import org.bouncycastle.pqc.math.linearalgebra.Permutation;

public class Day2_3 {

	//public static void main(String[] args) throws Exception {
		
//		Scanner scn = new Scanner(System.in);
//		
//		String str = scn.next();
//		
//		printPermutations(str, " ");
//
//	}
//
//	private static void printPermutations(String ques, String asf) {
//		
//		if(ques.length() == 0) {
//			System.out.println(asf);
//			return;
//		}
//		
//		for (int i = 0; i<ques.length(); i++) {
//			char ch  = ques.charAt(i);
//			String qlpart = ques.substring(0, i);
//			String qrpart = ques.substring(i + 1);
//			String roq = qlpart + qrpart;
//			printPermutations(roq, asf + ch);
//		}
//		
		
		public static String swapString(String a, int i, int j) {  
	        char[] b =a.toCharArray();  
	        char ch;  
	        ch = b[i];  
	        b[i] = b[j];  
	        b[j] = ch;  
	        return String.valueOf(b);  
	    }  
	      
	    public static void main(String[] args)  
	    {  
	        String str = "ABC";  
	        int len = str.length();  
	        System.out.println("All the permutations of the string are: ");  
	        generatePermutation(str, 0, len);  
	    }
	      
	    //Function for generating different permutations of the string  
	    public static void generatePermutation(String str, int start, int end)  
	    {  
	        //Prints the permutations  
	        if (start == end-1)  
	            System.out.println(str);  
	        else  
	        {  
	            for (int i = start; i < end; i++)  
	            {  
	                //Swapping the string by fixing a character  
	                str = swapString(str,start,i);  
	                //Recursively calling function generatePermutation() for rest of the characters   
	                generatePermutation(str,start+1,end);  
	                //Backtracking and swapping the characters again.  
	                str = swapString(str,start,i);  
	            }  
	}  
	}
}