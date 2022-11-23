package New;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDate {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat Datefor = new SimpleDateFormat("dd/MM/yyyy");
		{
			Date date = Datefor.parse("08/07/1999");
			System.out.println(date);
		}
	}

}
