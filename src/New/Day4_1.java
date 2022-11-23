package New;

public class Day4_1 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		int max =a[0];
		int min = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min= a[i];
			}
			else if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		
		
//		int a[] ={22,55,8,4,79,60,99};
//		
//		int min	= a[0];
//		
//		int max = a[0];
//		
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]<min)
//			{
//				min = a[i];
//			}
//			else if(a[i]>max)
//			{
//				max = a[i];
//			}
//		}
//		System.out.println("Smallest number is "+min);
//		System.out.println("Largest number is "+max);
		
//		int a[]= {1,2,3,4,5};
//		
//		int min = a[0];
//		
//		int max = a[0];
//		
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]<min)
//			{
//				min=a[i];
//			}
//			else if(a[i]>max)
//				
//			{
//				max=a[i];
//			}
//		}
//		
//		System.out.println(min);
//		System.out.println(max);
	}

}
