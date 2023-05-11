package fundamentalPrograms;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[] = {1,2,5,3};
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		
		int total = 0;
		int total2 = 0;
		
		for(int i=0;i<n.length;i++)
		{
			total = total + n[i];
		}
		
		System.out.println(total);
		
		for(int i=n[0];i<=n[n.length-1];i++)
		{
			total2 = total2 + i;
		}
		
		System.out.println(total2);
		
		System.out.println("missing is : "+(total2-total));
		

	}

}
