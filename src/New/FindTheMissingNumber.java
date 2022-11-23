package New;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

		int sum = (10 * 11) / 2;
		
		int actualSum = 0;
		
		for(int i=0; i<a.length; i++)
		{
			actualSum = actualSum + a[i];
		}
		
		System.out.println("Missing number is " + (sum - actualSum));
		
	}

}
