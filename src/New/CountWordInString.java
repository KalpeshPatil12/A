package New;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordInString {
	
	public static void main(String[] args) {
		
		String inputString;
		
		Scanner sc = new Scanner(System.in);
		
		int count;
		
		System.out.println("Enter the string here ");
		
		inputString = sc.nextLine();
		
		String[] wordsArray = inputString.split("\\s+");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String word : wordsArray) 
		{
			if(map.containsKey(word))
			{
				count = map.get(word);
				map.put(word, count + 1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) 
		{
			System.out.println(entry.getKey() + " : " +entry.getValue());
		}
 		
	}

}
