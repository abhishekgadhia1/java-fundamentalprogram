package fundamentalPrograms;

public class PalindromeStringWithReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "nayan";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("yes p");
		}
		else
		{
			System.out.println("no p");
		}

	}

}
