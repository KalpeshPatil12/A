package Basic;

public class StringToStringBudder {

	public static void main(String[] args) {
		
		// 1. String to StringBuffer.
		
		//String str ="Tech";
		
		//StringBuffer sb = new StringBuffer(str);
		
		//StringBuffer sb = new StringBuffer("Tech");
		
		//System.out.println(sb);
		
	//	2. StringBuffer to String
		
		// Constructor based approach
		
//		StringBuffer sb = new StringBuffer("Cyber");
//		
//		String str = new String(sb);
//		
//		System.out.println(str);

		// Method based Approach
		
		StringBuffer sb = new StringBuffer("Cyber");
		
		String str = sb.toString();
		
		System.out.println(str);
		
		System.out.println(sb.toString());
		
	}

}
