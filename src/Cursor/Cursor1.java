package Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Cursor1 {

	public static void main(String[] args) {
	
		//Enumeration Cursor
		
		Vector v=new Vector();
		
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		System.out.println(v);
		
		Enumeration e=v.elements();
		System.out.println((e.hasMoreElements()));
		System.out.println(e.nextElement());
		System.out.println(e.nextElement());

	}

}
