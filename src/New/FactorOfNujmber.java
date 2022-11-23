package New;

public class FactorOfNujmber {

	public static void main(String[] args) {
		
		int number = 60;

		System.out.println("Factors of the number are: ");
	    
	    for (int i = 1; i <= number; ++i) 
	    {
	      if (number % i == 0) 
	      {
	        System.out.print(i + " ");
	      }
	      
	    }
	    
	}

}
