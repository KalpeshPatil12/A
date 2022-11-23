package New;

import java.util.Scanner;

public class AddTwoThreeAndFourNumber {

	public static Scanner sc=new Scanner(System.in);

		static int add(int a,int b)
		{  
			return a+b;
		}  

		static int add(int a,int b,int c)
		{  
			return a+b+c;
		} 
		static int add(int a,int b,int c,int d)
		{  
			return a+b+c+d;
		} 
		public static void main(String[] args) 
		{
			while(true)
			{
	                 System.out.println("-----------------------------------------");
	                 System.out.println("Press 1 to add two number ");
			 System.out.println("Press 2 to add three number ");
			 System.out.println("Press 3 to add four number ");
			 System.out.println("Press 0 to continue ");
			 System.out.println("Press 9 to exit");
			 System.out.println("------------------------------------------");
			 int choice=sc.nextInt();
			 if (choice==1)
			 {
			      System.out.println("Enter two number");
			      int a=sc.nextInt();
			      int b=sc.nextInt();
			      System.out.println("sum = "+AddTwoThreeAndFourNumber.add(a,b));  
			 }
	                 if (choice==2)
			 {
			      System.out.println("Enter three number");
			      int a=sc.nextInt();
			      int b=sc.nextInt();
			      int c=sc.nextInt();
			      System.out.println("sum = "+AddTwoThreeAndFourNumber.add(a,b,c));   
			 }
			 if (choice==3)
			 {
			      System.out.println("Enter four number");
			      int a=sc.nextInt();
			      int b=sc.nextInt();
			      int c=sc.nextInt();
			      int d=sc.nextInt();
			      System.out.println("sum = "+AddTwoThreeAndFourNumber.add(a,b,c,d)); 
			 }
			 if(choice==0)
				{
				 continue;
				}
			if(choice==9)
				{
				 break;
				}
	                if(choice!=1&&choice!=2&&choice!=3&&choice!=0&&choice!=9)
				{
				System.out.println("invalid choice");
			        }
			


	}
}
}


