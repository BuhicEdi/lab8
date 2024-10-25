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

	public static void main(String[] args) throws FileNotFoundException {

		// Initerar räknarvaribalar samt en scanner som ska ta emot filnamn
		Scanner fileInput = new Scanner(System.in);
		int lines = 0, words = 0, chars = 0;

		// Frågar användaren efter filnamn
		System.out.printf("Mata in ett filnamn: ", "%n");
		String fileName = fileInput.next();
		fileInput.close();

		// Provar öppna filen
		File fileImport = new File(fileName);
		Scanner fileScanner = new Scanner(fileImport);

		// Läser in senaste raden samt ökar radantal med 1 samt beräknar längden på raden
		while (fileScanner.hasNextLine()) {
			String currentLine = fileScanner.nextLine();
			lines++;
			chars += currentLine.length();

			// Läser in raden separat och räknar antal ord
			Scanner wordScan = new Scanner(currentLine);
			while (wordScan.hasNext()) {
				wordScan.next();
				words++;
			}
			wordScan.close();
		}
		fileScanner.close();

		// Matar ut antalet radet, ord samt karaktärer
		System.out.println("Antalet rader var: " + lines);
		System.out.println("Antalet ord var: " + words);
		System.out.println("Antalet tecken var: " + chars);

		// Avslutar programmet
		System.exit(0);
	}
}
