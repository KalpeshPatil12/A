package New;

import java.util.ArrayList;
import java.util.HashMap;


public class Day9_1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Ram");
		
		map.put(2, "Shyam");
		
		map.put(3, "Due");
		
		map.put(4, "Sue");
		
		System.out.println(map);
		
		map.replace(3, "Kalpesh");
		
		System.out.println(map);
		
		System.out.println("Size of map is "+map.size());
		
		ArrayList<Integer> list = new ArrayList<Integer>(map.keySet());

		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<String>(map.values());
        
        System.out.println(list1);
        
	}
}
