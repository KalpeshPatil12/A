package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLists {

	public static void main(String[] args) {
		
		// By using addAll()

		List<Integer> list1 = new ArrayList<>();
		
		list1.add(2);
		list1.add(3);
		list1.add(5);
		System.out.println("First List: "+list1);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(4);
		list2.add(6);
		System.out.println("Secound List: "+list2);
		
		List<Integer> merge = new ArrayList<>();
		
		merge.addAll(list1);
		merge.addAll(list2);
		System.out.println("Merge List: "+merge);
		
		// By using Stream Class
		
		List<Integer> prime = new ArrayList<>(Arrays.asList(2, 3, 5));
		
		System.out.println("First List: "+prime);
		
		
		List<Integer> even = new ArrayList<>(Arrays.asList(4, 6));
		
		System.out.println("Secound List: "+even);
		
		//Convert both list into stream 
		
		Stream<Integer> list3 = prime.stream();
		Stream<Integer> list4 = even.stream();
		
		//Merged two stream 
		
		Stream<Integer> merged = Stream.concat(list3, list4);
		
		//Convert merged stream into list
		
		List<Integer> number = merged.collect(Collectors.toList());
		
		System.out.println("Merged List: "+number);
		
	}

}
