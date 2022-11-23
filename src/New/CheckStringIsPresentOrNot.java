package New;

public class CheckStringIsPresentOrNot {

	public static void main(String[] args) {
		
	    String str = "This is Programiz";
	    
	    String str1 = "Programiz";
	    
	    String str2 = "Programming";
	    
	    
	    if(str.contains(str1)) 
	    {
	      System.out.println(str1 + " is present in the string.");
	    }
	    
	    else
	    {
	      System.out.println(str1 + " is not present in the string.");
	    }

	    if(str.contains(str2))
	    {
	      System.out.println(str2 + " is present in the string.");
	    }
	    
	    else
	    {
	      System.out.println(str2 + " is not present in the string.");
	    }

	}

}
