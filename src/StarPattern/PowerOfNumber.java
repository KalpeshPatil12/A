package StarPattern;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		int num = 5;
		int power = 4;
		int mul = num;
		
		while(power>1)
		{
			num=num*mul;
			power--;
		}
		
		System.out.println(num);

	}

}
