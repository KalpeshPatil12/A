package New;

import java.util.Arrays;

public class ConcatenateArray {

	public static void main(String[] args) {
		
		int [] a = {1, 2, 3};
		
		int [] b = {4, 5, 6};
		
		int[] result = new int[a.length + b.length];
		
		int index = 0;
		
		for(int item : a)
		{
			result[index++] = item;
		}
		
		for(int item : b)
		{
			result[index++] = item;
		}
		
		System.out.println(Arrays.toString(result));
		

	}

}
