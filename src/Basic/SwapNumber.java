package Basic;

public class SwapNumber {

	public static void main(String[] args) {
		
//		int a=10, b=20;
//		
//		System.out.println("Before swapping the value are "+a+" , "+b);
//		
//		//By creating thrid variable
//		
//		int z=a;
//		a=b;
//		b=z;
//		
//		System.out.println("After swapping the value are "+a+" , "+b);
		
		String str="ABCD";
		
		String rev="";
		 
		int len=str.length(); //4
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string is "+rev);

	}

}
