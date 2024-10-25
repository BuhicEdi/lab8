package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Detta program tar emot en fil och beräknar sedan antalet rader, ord och tecken.
 * 
 * @author Edi Buhic
 * @version 2024-10-25
 */

public class P8_5 {

	public static void main(String[] args) {
		Scanner fileScan = new Scanner(System.in);
		int lines = 0, words = 0, chars = 0;

		System.out.printf("Mata in ett filnamn: ", "%n");
		String fileName = fileScan.next();
		fileScan.close();

		try {
			File fileImport = new File(fileName);
			Scanner fileScanner = new Scanner(fileImport);

			while (fileScanner.hasNextLine()) {
				String currentLine = fileScanner.nextLine();
				lines++;
				chars += currentLine.length();

				Scanner wordScan = new Scanner(currentLine);
				while (wordScan.hasNext()) {
					wordScan.next();
					words++;
				}
				wordScan.close();
			}
			fileScanner.close();

			System.out.println("Antalet rader var: " + lines);
			System.out.println("Antalet ord var: " + words);
			System.out.println("Antalet tecken var: " + chars);

			System.exit(0);
		} catch (FileNotFoundException err) {
			err.printStackTrace();
		}
	}
}
