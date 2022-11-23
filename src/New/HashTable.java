package New;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable();
		
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		
		System.out.println(ht);
		
		System.out.println(ht.remove(2));
		
		System.out.println(ht.get(3));
		
		ht.replace(1, "E");
		
		System.out.println(ht);

	}

}
