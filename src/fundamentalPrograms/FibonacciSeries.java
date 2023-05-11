package fundamentalPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int d1 = 0;
		int d2 = 1;
		
		System.out.println(d1);
		System.out.println(d2);
		
		for(int i=2;i<10;i++)
		{
			int sum = d1+d2;
			System.out.println(sum);
			d1=d2;
			d2=sum;
		}

	}

}
