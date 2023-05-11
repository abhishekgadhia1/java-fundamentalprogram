package fundamentalPrograms;

public class CountDigitsEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12345;
		int count_even=0;
		int count_odd=0;
		
		while(n!=0)
		{
			int digit = n%10;
			n=n/10;
			
			if(digit%2==0)
			{
				count_even++;
			}
			else
			{
				count_odd++;
			}
		}
		
		System.out.println("even : "+count_even);
		System.out.println("odd : "+count_odd);

	}

}
