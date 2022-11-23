package Basic;

public class StringMethod {

	public static void main(String[] args) {
		
//		String str = "Cyber";
//		
//		str=str.concat(" Success");
//		
//		System.out.println(str);
//		
//		StringBuffer sb = new StringBuffer("Cyber");
//		
//		sb=sb.append("Success");
//		
//		System.out.println(sb);
		
		String str = "CyberSuccess";
		
		System.out.println(str.contains("Cyber"));
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.lastIndexOf('s'));
		
		System.out.println(str.startsWith("Cy"));
		
		System.out.println(str.endsWith("ss"));
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(5, 8));
		
		System.out.println(str.trim());

	}

}
