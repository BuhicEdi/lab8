package lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Detta program läser in en fil och kopierar innehållet till en helt ny fil med radhantering.
 * 
 * @author Edi Buhic
 * @version 2024-10-25
 */

public class P8_2 {
	
	// Mainmetod som frågar efter filernas namn samt testar programmet
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.printf("Ange filnamnet på filen som ska avläsas: ", "%n");
		String fileData = readFile(s.nextLine());

		System.out.print("Ange nya filens namn: ");
		writeFile(fileData, s.nextLine());

		s.close();
		System.exit(0);
	}

	// Metod som läser in den existerande filen
	public static String readFile(String fileName) {
		
		// Öppnar filen
		File openFile = new File(fileName);
		String fileData = null;

		// Testar att läsa av allt innehåll till en sträng
		try {
			Scanner s = new Scanner(openFile);

			while (s.hasNext()) {
				fileData += s.nextLine() + "\n";
			}
			s.close();
		} catch (IOException err) {
			System.exit(1);
		}
		
		// Returnerar filens data
		return fileData;
	}

	// Metod som tar emot fildata samt namnet på nya filen
	public static void writeFile(String data, String newFileName) {
		
		// Skapar nya filen samt initierar en ny variabel för radhantering
		File newFile = new File(newFileName);
		Scanner s = new Scanner(data);
		int rowCount = 1;

		// Testar att skriva till den nya filen tillsammans med radnummer
		try {
			FileWriter fileWrite = new FileWriter(newFile);

			while (s.hasNext()) {
				fileWrite.write("/* " + rowCount + " */ " + s.nextLine() + "\n");
				rowCount++;
			}

			s.close();
			fileWrite.close();
		} catch (IOException err) {
			System.exit(1);
		}

		// Matar ut nya filens namn samt antal rader som skrivits över till användaren
		System.out.println("Kopierade " + (rowCount - 1) + " rader till " + newFileName + ".");
		
		// Avslutar programmet
		System.exit(0);
	}
}
