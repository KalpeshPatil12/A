package Basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\Appzlogic\\File.txt");
		
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write("kalpesh");
		
		bw.write("patil");
		
		bw.write("kinhi");
		
		System.out.println("Close");

		bw.close();
	}

}
