package New;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindMinimumNumberInHashSet {

	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<Integer>();
		
	      hs.add(24);
	      
	      hs.add(56);
	      
	      hs.add(87);
	      
	      hs.add(64);
	      
	      hs.add(29);
	      
	      hs.add(2);
	      
	      hs.add(65);
	      
	      System.out.println("Elements in set = "+hs);
	      
	      Object obj = Collections.min(hs);
	      
	      System.out.println("Minimum Element = "+obj);
	}

}
