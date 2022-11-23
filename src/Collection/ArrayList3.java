package Collection;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(true);
		al.add('c');
		al.add("Cyber");
		al.add("Success");
		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
		//System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.contains("cyber"));
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
	
		
		

	}

}
