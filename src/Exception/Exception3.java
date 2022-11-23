package Exception;

public class Exception3 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Inside try block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}

	}

}
