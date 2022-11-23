package StarPattern;

public class SumOfDivisorNumber {
				
		static int divisorSum(int n)
		{
			int sum = 0;

			for (int i = 1; i <= n; i++) 
			{
				
				for (int j = 1; j * j <= i; j++) 
				{
					if (i % j == 0) 
					{
						if (i / j == j)
							sum += j;
						else
							sum += j + i / j;
					}
				}
			}
			return sum;
		}

		public static void main(String args[])
		{
			int n = 4;
			System.out.println(divisorSum(n));
			n = 5;
			System.out.println(divisorSum(n));
		}

	}


