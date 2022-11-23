package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {

	public static void main(String[] args) {


		ArrayList al=new ArrayList();
		
		al.add("Cyber");
		al.add("Success");
		al.add("Amber");
		al.add("Kyber");
		al.add("Slumber");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

	}

}
