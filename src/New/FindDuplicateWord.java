package New;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateWord {

		public static void main(String args[]) {
		      
		      String input = "Big black bug bit a big black dog on his big black nose";
		      
		      input = input.toLowerCase();
		      
		      String[] strArray = input.split(" ");
		      
		      List<String> listOfWords = Arrays.asList(strArray);
		      
		      HashSet<String> uniqueWords = new HashSet<>(listOfWords);
		      
		      for(String word : uniqueWords)
		      {
		          if(Collections.frequency(listOfWords,word) > 1)
		            System.out.print(" "+ word+" ");
		      }
		      
		    }
		
}
	

