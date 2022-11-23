package Exception;

public class Exception1 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/2);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
		}
		

	}

}
