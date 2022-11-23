package StarPattern;

public class MillisecoundsToSecoundAndMinutes {

	public static void main(String[] args) {
		
		long milliSecound = 5200000;
		
		long minutes = (milliSecound/1000) / 60;
		
		long secounds = (milliSecound/1000) % 60;
		
		System.out.println("MilliSecounds "+milliSecound);
		System.out.println("Minutes "+minutes);
		System.out.println("Secounds "+secounds);

	}

}
