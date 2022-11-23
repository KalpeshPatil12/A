package Exception;

public class Exception2 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
			System.out.println("Inside try block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
		}

	}

}
