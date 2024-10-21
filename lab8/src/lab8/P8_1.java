package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P8_1 {

	public static void main(String[] args) {
		File hello = new File("hello.txt");

		try {
			FileWriter helloWrite = new FileWriter(hello);
			helloWrite.write("Brynäs Hej, Hej, Hej\r\n"
					+ "Kom och sjung med mig\r\n"
					+ "Var med och hylla vårat lag\r\n"
					+ "Ingen får vara sur\r\n"
					+ "Det ger ingen tur\r\n"
					+ "Här är bara friska tag\r\n"
					+ "\r\n"
					+ "Brynäs Hej, Hej, Hej\r\n"
					+ "Både grabb och tjej\r\n"
					+ "Stäm nu in i denna kör\r\n"
					+ "Om vi bara friskar på\r\n"
					+ "Inget lag kan slå oss då\r\n"
					+ "Så kom och sjung i Brynäs Hej\r\n"
					+ "\r\n"
					+ "Svart och gul och vit\r\n"
					+ "Och med målaptit\r\n"
					+ "Det är vårat Brynäslag\r\n"
					+ "Vilket härligt gäng\r\n"
					+ "Vi ska ta poäng\r\n"
					+ "Ut i denna match idag\r\n"
					+ "\r\n"
					+ "Brynäs Hej, Hej, Hej\r\n"
					+ "Kom och sjung med mig\r\n"
					+ "Kom och hylla vårat lag\r\n"
					+ "Om ni stödjer var batalj\r\n"
					+ "Blir det säkert en medalj\r\n"
					+ "Så kom och sjung i Brynäs Hej");
			helloWrite.close();		
		} catch (IOException err) {
			System.out.println(err.getLocalizedMessage());
		}

		try {
			Scanner helloScan = new Scanner(hello);

			while (helloScan.hasNextLine()) {
				String helloData = helloScan.nextLine();
				System.out.println(helloData);
			}

			helloScan.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		try {
			FileWriter helloWrite = new FileWriter(hello);
			helloWrite.write("Hello, World!");
			helloWrite.close();		
		} catch (IOException err) {
			System.out.println(err.getLocalizedMessage());
		}

		try {
			Scanner helloScan = new Scanner(hello);

			while (helloScan.hasNextLine()) {
				String helloData = helloScan.nextLine();
				System.out.println(helloData);
			}

			helloScan.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



		System.exit(0);	
	}
}
