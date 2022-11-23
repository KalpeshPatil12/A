package Collection;

public class ForEach {

	public static void main(String[] args) {
		
		{
			int [] a= {100,200,300,400,500};
			
			System.out.println(a[4]);
			
			System.out.println("***************************************************");
			
			//for it method
			for(int i=0; i<a.length; i++)
			{
				System.out.println(a[i]);
			}
			
			
			System.out.println("***************************************************");
			//for each method
			for(int aa:a)
			{
				System.out.println(aa);
			}
		}

	}

}
