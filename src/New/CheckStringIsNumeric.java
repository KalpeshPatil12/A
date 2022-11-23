package New;

public class CheckStringIsNumeric {

	public static void main(String[] args) {
		
		String str = "12345.15";
		
		boolean num = true;
		
		try 
		{
            Double number = Double.parseDouble(str);
        } 
		catch (NumberFormatException e) 
		{
        	num = false;
        }
		
		if(num)
		{
			System.out.println("String is numeric");
		}
		else
		{
			System.out.println("String is not numeric");
		}

	}

}
