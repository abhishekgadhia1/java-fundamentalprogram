package fundamentalPrograms;

public class PalindromeNumberWithoutReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 123321;
		String s = Integer.toString(n);
		boolean flag = false;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				System.out.println("no p");
				flag = true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("yes p");
		}

	}

}
