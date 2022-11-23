package StarPattern;

public class DigitNumber {
		
		static int printMaxNum(int num)
	    {
	        int count[] = new int[10];
	    
	        String str = Integer.toString(num);
	         
	        for(int i=0; i < str.length(); i++)
	            count[str.charAt(i)-'0']++;
	      
	        int res = 0, mul = 1;
	        
	        for (int i = 0; i <= 9; i++)
	        {
	            while (count[i] > 0)
	            {
	            	res = res + (i * mul);
	                count[i]--;
	                mul = mul * 10;
	            }
	        }
	        
	        return res;
	    }
	    
	    public static void main(String[] args)
	    {
	        int num = 38293367;
	        System.out.println(printMaxNum(num));
	    }
	

}
