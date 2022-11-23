package Cursor;

import java.util.ListIterator;
import java.util.Vector;

public class Cursor3 {

	public static void main(String[] args) {


		Vector v=new Vector();
		
		v.add(1000);
		v.add(2000);
		v.add(3000);
		v.add(4000);
		v.add(5000);
		System.out.println(v);
		
		ListIterator li=v.listIterator();
		System.out.println(li.hasNext());
		System.out.println(li.next());

	}

}
