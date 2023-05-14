package fundamentalPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteDataIntoTextFile {
	
	public static void main(String[] args) {
		
		FileWriter fw = new FileWriter(null);
		
		BufferedWriter bw = new BufferedWriter(fw);
	
		bw.write("hey hey hey");
		
		System.out.println("done");
		
		bw.close();
	}

}
