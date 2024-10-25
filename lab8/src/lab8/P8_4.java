package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P8_4 {

	public static void main(String[] args) {
		try {
			File textFile = new File("ettfilnamn");
			Scanner scan = new Scanner(textFile);
			double[] columnAvg = getAvgCols(scan);
			scan.close();
		} catch (FileNotFoundException err) {
			System.exit(1);
		}
		
		System.exit(0);
	}

	public static double[] getAvgCols(Scanner reader) {
		double[] cols = new double[2];
		int[] colCount = new int[2];
		
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			Scanner scan = new Scanner(line);
			int index = 0;
			
			while (scan.hasNextDouble()) {
				cols[index] += scan.nextDouble();
				colCount[index]++;
				index++;
			}
			scan.close();
		}
		
		cols[0] = (cols[0] / colCount[0]);
		cols[1] = (cols[1] / colCount[1]);
		
		return cols;
	}
	
}
