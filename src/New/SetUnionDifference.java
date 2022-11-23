package New;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUnionDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer A[] = {1, 3, 2, 4, 8, 9, 0};
		
		Integer B[] = {1, 3, 7, 5, 4, 0, 7, 5};
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		set1.addAll(Arrays.asList(A));
		
		Set<Integer> set2 = new HashSet<Integer>();
		
		set2.addAll(Arrays.asList(B));
		
		// finding union of set1 and set2
		
		Set<Integer> union_data = new HashSet<Integer>(set1);
		
		union_data.addAll(set2);
		
		System.out.println("Union of set and se2 is :"+union_data);
		
		// Finding intersection of set1 and set2
		
		Set<Integer> intersection_data = new HashSet<Integer>(set1);
		
		intersection_data.retainAll(set2);
		
		System.out.println("Intersection of set1 and set2 is :"+intersection_data);
		
		// Finding Difference of set1 and set2
		
		Set<Integer> difference_data = new HashSet<Integer>(set1);
		
		difference_data.removeAll(set2);
		
		System.out.println("Difference of set1 and set2 is :"+difference_data);
		
		
		

	}

}
