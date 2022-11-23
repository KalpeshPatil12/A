package New;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		   
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("orange");
    
    
      System.out.println("Original linked list:" + list); 

      for(int a=0; a < list.size(); a++)

       {
             System.out.println("Element at index "+a+": "+list.get(a));
       } 


	}

}
