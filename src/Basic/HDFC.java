package Basic;

public class HDFC {

	
	HDFC(String cust_name)
	{
		System.out.println("Logic to open the saving account foe cust name is "+cust_name);
	}
	
	HDFC(String cust_name, String business_name)
	{
		System.out.println("Logic to open the current account for cust name is "+cust_name+ " for business "+business_name);
	}
	
	public static void main(String[]args)
	{
		System.out.println("Start");
		HDFC acc1=new HDFC("kalpesh");
		HDFC acc2=new HDFC("kalpesh", "Cyber Scurity");
		System.out.println("Stop");
	}

}
    