package New;

import java.util.Arrays;

public class Day6_1 {

	public static void main(String[] args) {
		
		int array[] = {800,200,500,400,100,600};
		
		System.out.println("Before sorting array "+Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println("After sorting array "+Arrays.toString(array));
		
//		Arrays.sort(array);
//
//		System.out.println("Sorted in ascending order");
//		
//		for(int i=0; i<array.length; i++)
//		{
//			System.out.println(array[i]);
//		}
//		
		
//		int temp=0;
//		
//		for(int i=0; i<array.length; i++)
//		{
//			for(int j=i+1; j<array.length; j++)
//			{
//				if(array[i]<array[j])
//				{
//					temp=array[i];
//					array[i]=array[j];
//					array[j]=temp;
//					
//				}
//			}
//		}
//		System.out.println();
//		System.out.println("Element of sorted array");
//		for(int i=0; i<=array.length; i++)
//		{
//			System.out.print(array[i]+ " ");
//		}
	}

}
