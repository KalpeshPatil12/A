package New;

import java.util.ArrayList;
import java.util.List;

public class SubListOfAnElement {

	public static void main(String[] args) {
		
		// Try block for exception
        try { 
  
            ArrayList<Integer> 
                arrlist = new ArrayList<Integer>(); 
  
            // Populating arrlist1 
            arrlist.add(1); 
            arrlist.add(4); 
            arrlist.add(9); 
            arrlist.add(25); 
            arrlist.add(36); 
  
            // Print arrlist 
            System.out.println("Original arrlist: "
                            + arrlist); 
  
            // Getting the subList 
            // using subList() method 
            List<Integer> arrlist2 = arrlist.subList(2, 4); 
  
            // Print the subList 
            System.out.println("Sublist of arrlist: "
                            + arrlist2); 
        } 
  
        // Catch block for exception
        catch (IndexOutOfBoundsException e) 
        { 
            System.out.println("Exception thrown : " + e); 
        } 
        
        // Catch block for exception
        catch (IllegalArgumentException e) 
        { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 

}
