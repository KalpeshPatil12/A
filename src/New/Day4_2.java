package New;

public class Day4_2 {

	public static void main(String[] args) {
		
//		Program 1.Input : Marks =N
//				Conditions for printing Output: If N>75 print Grade A,N>60 print Grade B,N>40 print Grade C,N<40 Print Fail
//
//				Program 2.Input :Array[]={22,55,8,4,79,60,99}
//				  Output: Largest No=99
//				                 Smallest No=4

		int N = 110;
		
		if(N>75)
		{
			System.out.println("Grade A");
		}
		else if(N>60)
		{
			System.out.println("Grade B");
		}
		else if(N>40)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
