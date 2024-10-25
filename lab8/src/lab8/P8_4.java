package lab8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * Detta program tar emot en textfil innehållandes två kolumner av flyttal och beräknar samt returnar sedan medelvärdet.
 * 
 * @author Edi Buhic
 * @version 2024-10-25
 */
public class P8_4 {

	// Mainmetod som testar programmet
	public static void main(String[] args) {
		Scanner fileScan = new Scanner(System.in);

		System.out.printf("Mata in ett filnamn: ", "%n");
		String fileName = fileScan.next();
		fileScan.close();

		try {
			File textFile = new File(fileName);
			Scanner scan = new Scanner(textFile);

			double[] columnAvg = getAvgCols(scan);
			scan.close();

			System.out.println("Medelvärdet för kolumn 1: " + columnAvg[0]);
			System.out.println("Medelvärdet för kolumn 2: " + columnAvg[1]);

			System.exit(0);
		} catch (IOException err) {
			System.exit(1);
		}
	}

	// Metod som beräknar medelvärdet
	public static double[] getAvgCols(Scanner reader) {

		// Attribut som lagrar flyttalen samt antalet tal per kolumn
		double[] cols = new double[2];
		int[] colCount = new int[2];

		// Läser in nästa rad ända tills filens slut
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			Scanner scan = new Scanner(line);
			int index = 0;

			// Adderar in talet i en array samt ökar antalet tal
			while (scan.hasNextDouble()) {
				cols[index] += scan.nextDouble();
				colCount[index]++;
				index++;
			}
			scan.close();
		}

		// Beräknar medelvärdet med hjälp utav våra attribut
		cols[0] = (cols[0] / colCount[0]);
		cols[1] = (cols[1] / colCount[1]);

		// Returnerar arrayen med medelvärden
		return cols;
	}
}
