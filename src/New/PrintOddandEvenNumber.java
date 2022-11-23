package New;

public class PrintOddandEvenNumber {

	public static void main(String[] args) {
		
		int a[] = {2,55,8,4,79,60,99};
		
		System.out.println("For odd number");
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("For even number");
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
