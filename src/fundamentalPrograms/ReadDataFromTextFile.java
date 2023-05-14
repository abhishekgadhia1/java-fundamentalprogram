package fundamentalPrograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDataFromTextFile {
public static void main(String[] args) {
	
	FileReader fr = new FileReader(null);
	
	BufferedReader br = new BufferedReader(fr);
	
	String s;
	
	while((s = br.readLine())!=null)
	{
		System.out.println(str);
	}
	
	br.close();
}
}
