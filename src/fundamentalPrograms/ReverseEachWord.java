package fundamentalPrograms;

import java.util.Arrays;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		 
		String s = "hey beta kaise ho";
		
		String words[] = s.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		String revS = "";
		
		for(String word : words)
		{
			String rev = "";
			for(int i=word.length()-1;i>=0;i--)
			{
				rev = rev + word.charAt(i);
			}
			
			revS = revS + rev + " ";
		}
		
		System.out.println(revS);
	}

}
