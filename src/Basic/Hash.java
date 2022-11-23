package Basic;

import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		
		HashMap m=new HashMap();
		
		m.put(101, "Ram");
		m.put(102, "Shyam");
		m.put(103, "John");
		m.put(104, "Scoot");
		
		System.out.println(m);
		
		System.out.println(m.get(103));
		
		m.remove(104);
		
		System.out.println(m);
		
		System.out.println(m.containsKey(102));
		
		System.out.println(m.containsValue("John"));
		
		System.out.println(m.isEmpty());
		
		// Print the key individually
		for(Object i:m.keySet())
		{
			System.out.println(i);
		}
		
		System.out.println(m.values());
		
		//Print the value individually
		for(Object i:m.values())
		{
			System.out.println(i);
		}
		
		System.out.println(m.entrySet());
		
		System.out.println(m.keySet());
		
		//Print both value and key individually
		for(Object i:m.keySet())
		{
			System.out.println(i+"  "+m.get(i));
		}

	}

}
