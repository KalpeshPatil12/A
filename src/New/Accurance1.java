package New;

public class Accurance1 {
	
	public static void main(String[]args) {
		
		String s = "big black bug bit a big black dog";
		
		int totalcount = s.length();
		
		System.out.println(totalcount);  // Including space
		
		int totalcountAfterRemove_b = s.replace("b", "").length();
		
		int totalcountAfterRemove_i = s.replace("i", "").length();
		
		int totalcountAfterRemove_g = s.replace("g", "").length();
		
		int totalcountAfterRemove_l = s.replace("l", "").length();
		
		int totalcountAfterRemove_a = s.replace("a", "").length();
		
		int totalcountAfterRemove_c = s.replace("c", "").length();
		
		int totalcountAfterRemove_k = s.replace("k", "").length();
		
		int totalcountAfterRemove_u = s.replace("u", "").length();
		
		int totalcountAfterRemove_t = s.replace("t", "").length();
		
		int totalcountAfterRemove_d = s.replace("d", "").length();
		
		int totalcountAfterRemove_o = s.replace("o", "").length();
		
		int count1 = totalcount - totalcountAfterRemove_b;
		
		int count2 = totalcount - totalcountAfterRemove_i;
				
		int count3 = totalcount - totalcountAfterRemove_g;
		
		int count4 = totalcount - totalcountAfterRemove_l;
		
		int count5 = totalcount - totalcountAfterRemove_a;
		
		int count6 = totalcount - totalcountAfterRemove_c;
		
		int count7 = totalcount - totalcountAfterRemove_k;
		
		int count8 = totalcount - totalcountAfterRemove_u;
				
		int count9 = totalcount - totalcountAfterRemove_t;
		
		int count10 = totalcount - totalcountAfterRemove_d;
		
		int count11 = totalcount - totalcountAfterRemove_o;
		
    	System.out.println("Number of occurance of b is "+count1);
    	
    	System.out.println("Number of occurance of i is "+count2);
    	
    	System.out.println("Number of occurance of g is "+count3);
    	
    	System.out.println("Number of occurance of l is "+count4);
    	
    	System.out.println("Number of occurance of a is "+count5);
    	
    	System.out.println("Number of occurance of c is "+count6);
    	
    	System.out.println("Number of occurance of k is "+count7);
    	
    	System.out.println("Number of occurance of u is "+count8);
    	
    	System.out.println("Number of occurance of t is "+count9);
    	
    	System.out.println("Number of occurance of d is "+count10);
    	
    	System.out.println("Number of occurance of o is "+count11);
    	
	}

}
