package Collection;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add("Cyber");
		al.add(true);
		al.add('c');
		System.out.println(al);
		
		ArrayList al1=new ArrayList(al);
		
		al1.add("Success");
		al1.add(300);
		al1.add('z');
		
		System.out.println(al1);
		
		ArrayList al2=new ArrayList();
		
		al2.addAll(al1);
		al2.addAll(al);
		al.add("Kalpesh");
		al.add(500);
		System.out.println(al2);
	}

}
