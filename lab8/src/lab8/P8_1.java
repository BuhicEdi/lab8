package lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class P8_1 {

	public static void main(String[] args) {
		File hello = new File("hello.txt");
		
		try {
		FileWriter helloWrite = new FileWriter(hello);
		helloWrite.write("pucksac");
		helloWrite.close();
		} catch (IOException err) {
			System.out.println(err.getLocalizedMessage());
		}
	System.exit(0);	
	}
}
