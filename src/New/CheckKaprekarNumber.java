package New;

import java.util.Scanner;

public class CheckKaprekarNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number here");
		
		int num = sc.nextInt();
		
		int square = num*num;
		
		int digitCount = 0;
		
		int temp = num;
		
		while(temp>0)
		{
			temp=temp/10;
			digitCount++;
		}
		
		int num2=(int) Math.pow(10, digitCount);
		int part1=square/num2;
		int part2=square%num2;
		
		if(num==part1+part2)
		
			System.out.println("Number is Kaprekar");
		
		else
		
			System.out.println("Number is not Kaprekar");
		
		
		

	}

}
