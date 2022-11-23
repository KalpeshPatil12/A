package New;

public class PanagramString {

	public static void main(String[] args) {
		
			String s = "the quick brown fox jumps over a lazy dog";
			isPanagram(s.toLowerCase());

	}

	private static boolean isPanagram(String s) {
		if(s.length()<26)
		{
			return false;
		}
		else
		{
			for(char ch = 'a'; ch <= 'z'; ch++)
			{
				if(s.indexOf(ch) < 0)
				{
					return false;
				}
			}
		}
		return true;
		
	}

}
