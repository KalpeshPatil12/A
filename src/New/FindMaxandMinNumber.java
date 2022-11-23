package New;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FindMaxandMinNumber {

	public static void main(String[] args) {
		
		Integer [] num = {6, 5, 9, 12, 76};
		
		int max = Collections.max(Arrays.asList(num));
		
		int min = Collections.min(Arrays.asList(num));
		
		System.out.println("Min number of arrys is: "+min);
		
		System.out.println("Max number of arrays is: "+max);
	
		

	}

}
