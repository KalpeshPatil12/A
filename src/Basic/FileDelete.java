package Basic;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		
	
		File file = new File("D:\\Appzlogic\\File.txt");
		
		if(file.delete())
		{
			System.out.println("File deleted");
		}
		else
		{
			System.out.println("File is not deleted");
		}
		
		
		
	}

}
