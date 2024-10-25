package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class P8_5 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(System.in);

		System.out.printf("Mata in ett filnamn: ", "%n");
		String fileName = fileScan.next();
		fileScan.close();

		File fileImport = new File(fileName);

		try {
			getFileStats(fileImport);
			System.exit(0);
		} catch (IOException err) {
			System.exit(1);
		}

	}

	public static void getFileStats(File file) throws IOException {

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
