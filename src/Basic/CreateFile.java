package Basic;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		try
		{
			File file = new File("D:\\file.txt");
			
			if(file.createNewFile())
			{
				System.out.println("File created");
			}
			else
			{
				System.out.println("File is already exit");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error accured");
			e.printStackTrace();
		}

	}

}
