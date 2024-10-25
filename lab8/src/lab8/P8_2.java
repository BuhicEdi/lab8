package lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P8_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.printf("Ange filnamnet på filen som ska avläsas: ", "%n");
		String fileData = readFile(s.nextLine());

		System.out.print("Ange nya filens namn: ");
		writeFile(fileData, s.nextLine());

		s.close();
		System.exit(0);
	}

	public static String readFile(String fileName) {
		File openFile = new File(fileName);
		String fileData = null;

		try {
			Scanner s = new Scanner(openFile);

			while (s.hasNext()) {
				fileData += s.nextLine() + "\n";
			}
			s.close();
		} catch (IOException err) {
			System.exit(1);
		}

		return fileData;
	}

	public static void writeFile(String data, String newFileName) {
		File newFile = new File(newFileName);
		Scanner s = new Scanner(data);
		int rowCount = 1;

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

		System.out.println("Kopierade " + (rowCount - 1) + " rader till " + newFileName + ".");
	}
}
