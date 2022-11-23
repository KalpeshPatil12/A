package New;

public class OctaltoDecimal {

	public static void main(String[] args) {
		
		String octalString = "140";
		
		int decimal = Integer.parseInt(octalString, 8);
		
		System.out.println(decimal);
		
	}

}
