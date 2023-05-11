package fundamentalPrograms;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abhishek loves java very much";
		int count = 1;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
