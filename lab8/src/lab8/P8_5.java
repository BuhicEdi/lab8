package lab8;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class P8_5 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(System.in);

		System.out.printf("Mata in ett filnamn: ", "%n");
		String fileName = fileScan.next();
		fileScan.close();
		
		getFileStats(fileName);
	}
	
	public static void getFileStats(String fileName) {
		Scanner lineScan = new Scanner(fileName);
		int lines = 0, words = 0, chars = 0;
		
		while (lineScan.hasNextLine()) {
			String currentLine = lineScan.nextLine();
			lines++;
			chars += currentLine.length();
			
			Scanner wordScan = new Scanner(currentLine);
			while (wordScan.hasNext()) {
				words++;
			}
			wordScan.close();
		}
		lineScan.close();
		
		System.out.println("Antalet rader var: " + lines);
		System.out.println("Antalet ord var: " + words);
		System.out.println("Antalet tecken var: " + chars);
	}

}
