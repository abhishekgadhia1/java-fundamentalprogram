package fundamentalPrograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int fac = 1;
		
		for(int i=n;i>0;i--)
		{
			fac = fac * i;
		}

		System.out.println(fac);
	}

}
