package New;

import java.util.Arrays;

public class SecoundLargestValue {

	public static void main(String[] args) {
		
		// 2nd largest value
		
		int a[] = {1,2,3,5,4,6,8,7,9};
		
		int size = a.length;
		
	    Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int rev = a[size-3];
		
		System.out.println(rev);
		
		// 2 nd smallest value
		
		int b[] = {1,2,3,4,5,6};
		
		int size_of_b = b.length;
		
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(b));
		
		int reverse = b[2];
		
		System.out.println(reverse);

	}

}
