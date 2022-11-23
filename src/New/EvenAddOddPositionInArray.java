package New;

public class EvenAddOddPositionInArray {

	public static void main(String[] args) {
		
		int a[] = new int[] {1,2,3,4,5};
		
		System.out.println("Element of array are present in even position");
		
		System.out.println("Element of array are present in odd position");
		
		for(int i=0; i<a.length; i=i+3)
		{
			System.out.println(a[i]);
		}
		
	}

}
