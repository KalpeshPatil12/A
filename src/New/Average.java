package New;

public class Average {

	public static void main(String[] args) {
		
	        double[] n = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
	        
	        double sum = 0.0;

	        for (double num: n) 
	        {
	           sum += num;
	        }

	        double average = sum / n.length;
	        
	       // System.out.println(average);
	        
	        System.out.format("The average is: %.2f", average);
	    }

}
