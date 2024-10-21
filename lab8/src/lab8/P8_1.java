package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Detta program skapar en ny fil vid namn hello.txt där den sedan skriver över data till den för att efter det mata ut datan till användaren.
 * 
 * @author Edi Buhic
 * @version 2024-10-21
 */

public class P8_1 {

	public static void main(String[] args) {
		// Skapar vår nya textfil
		File helloNew = new File("hello.txt");

		// Provar att öppna samt skriva till nya textfilen
		try {
			FileWriter helloWrite = new FileWriter(helloNew);

			helloWrite.write("lorem ipsum");
			helloWrite.close();
		} catch (IOException err) {
			err.printStackTrace();
		}

		// Provar att öppna och mata ut all data från textfilen
		try {
			Scanner helloScan = new Scanner(helloNew);

			while (helloScan.hasNextLine()) {
				String helloData = helloScan.nextLine();
				System.out.println("Data from " + helloNew.toString() + ": " + helloData);
			}

			helloScan.close();
		} catch (FileNotFoundException err) {
			err.printStackTrace();
		}

		// Öppnar textfilen för att skriva ny data
		try {
			FileWriter helloWrite = new FileWriter(helloNew);
			helloWrite.write("Hello, World!");
			helloWrite.close();		
		} catch (IOException err) {
			System.out.println(err.getLocalizedMessage());
		}

		// Öppnar textfilen och läser samt matar ut all data från textfilen
		try {
			Scanner helloScan = new Scanner(helloNew);

			while (helloScan.hasNextLine()) {
				String helloData = helloScan.nextLine();
				System.out.println("Data from " + helloNew.toString() + ": " + helloData);
			}

			helloScan.close();
		} catch (FileNotFoundException err) {
			err.printStackTrace();
		}

		// Avslutar programmet
		System.exit(0);	
	}
}
