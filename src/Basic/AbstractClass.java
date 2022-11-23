package Basic;

abstract class AbstractClass {

	abstract void loan();
	abstract void insurance();
	abstract void fianance();
	
}

abstract class HDFCloan extends AbstractClass
{
	void loan()
	{
		System.out.println("Inside logic for loan");
	}
}

abstract class HDFCinsurance extends HDFCloan
{
	void insurance()
	{
		System.out.println("Inside logic for insurance");
	}
}

class HDFCfinance extends HDFCinsurance
{
	void fianance()
	{
		System.out.println("Inside logic for fianance");
	}	

	public static void main(String[]args)
	{
	
	HDFCfinance bank = new HDFCfinance();
	bank.loan();
	bank.insurance();
	bank.fianance();
}
}