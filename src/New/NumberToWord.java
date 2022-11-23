package New;

public class NumberToWord {
	
	public static void main(String[]args)
	{
		
		// We can also swap two numbers using multiplication and division operator.
		
		int x = 10;
		int y = 20;
		
		System.out.println("Value before swaping");
		System.out.println("X = "+ x + " Y= " +y);
		
//		x=x*y;
//		y=x/y;
//		x=x/y;
//		
//		System.out.println("Value after swaping");
//		System.out.println("X = "+ x +" Y= " +y);
		
		// By using betwise operator
		
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println("Value after swaping");
		System.out.println("X = "+ x + " Y= " +y);	
		
		
	}

	
}