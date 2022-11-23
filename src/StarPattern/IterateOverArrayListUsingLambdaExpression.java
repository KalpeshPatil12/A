package StarPattern;

import java.util.ArrayList;

public class IterateOverArrayListUsingLambdaExpression {

	public static void main(String[] args) {
		
	      ArrayList<String> name = new ArrayList<>();
	      
	      name.add("Ram");
	      
	      name.add("Shyam");
	      
	      name.add("Joe");
	      
	      name.forEach((e) -> 
	      {
	         System.out.println(e + " ");
	      });
	   }



}
