package New;

public class Day8_1 {

	public static void main(String[] args) {
		
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=8; j++)
			{
				if(j+i<4)
				{
					System.out.print("-");
				}
				else
				{
					if(((j+i)%2!=0)||(j-i>=5))
						System.out.print("-");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
