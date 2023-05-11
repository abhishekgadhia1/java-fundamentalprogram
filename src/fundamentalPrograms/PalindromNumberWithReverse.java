package fundamentalPrograms;

public class PalindromNumberWithReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12321;
		int on = 12321;
		int rev = 0;
		
		while(n>0)
		{
			rev = rev*10 + n%10;
			n = n/10;
		}
		
		if(rev == on)
		{
			System.out.println("yes p");
		}
		else
		{
			System.out.println("no p");
		}

	}

}
