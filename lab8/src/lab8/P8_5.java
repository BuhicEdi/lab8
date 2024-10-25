package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P8_5 {

	public static void main(String[] args) {
		Scanner fileScan = new Scanner(System.in);

		System.out.printf("Mata in ett filnamn: ", "%n");
		String fileName = fileScan.next();
		fileScan.close();

		try {
			File fileImport = new File(fileName);
			getFileStats(fileImport);
			
			System.exit(0);
		} catch (FileNotFoundException err) {
			err.printStackTrace();
		}
	}

	public static void getFileStats(File file) throws FileNotFoundException {
		Scanner lineScan = new Scanner(file);
		int lines = 0, words = 0, chars = 0;

		while (lineScan.hasNextLine()) {
			String currentLine = lineScan.nextLine();
			System.out.println(currentLine);
			lines++;
			chars += currentLine.length();

			Scanner wordScan = new Scanner(currentLine);
			while (wordScan.hasNext()) {
				wordScan.next();
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
