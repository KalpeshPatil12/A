package New;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoList {

	public static void main(String[] args) {
		
		Set<Integer> list1 = new HashSet<>();
		
		list1.add(2);
		list1.add(3);
		
		Set<Integer> list2 = new HashSet<>();
		
		list2.add(2);
		list2.add(4);
		
		list2.retainAll(list1);
		
		System.out.println("Intersection: "+list2);

	}

}
