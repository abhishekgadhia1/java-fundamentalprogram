package fundamentalPrograms;

public class PrintOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12345;
		int ce=0;
		int co=0;
		
		while(n>0)
		{
			int digit = n%10;
			if(digit%2==0)
			{
				ce++;
			}
			else
			{
				co++;
			}
			n=n/10;
		}
		
		System.out.println(ce+" "+co);

	}

}
