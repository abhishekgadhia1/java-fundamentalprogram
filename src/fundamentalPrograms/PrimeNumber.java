package fundamentalPrograms;

public class PrimeNumber {
public static void main(String[] args) {
	
	int n = 23;
	boolean flag = false;
	
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println("not a prime number");
			flag = true;
			break;
		}
	}
	
	if(flag==false)
	{
		System.out.println("is a prime number");
	}
}
}
