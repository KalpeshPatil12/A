package Cursor;

import java.util.Iterator;
import java.util.Vector;

public class Cursor2 {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
		
		Iterator i=v.iterator();
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());

	}

}
