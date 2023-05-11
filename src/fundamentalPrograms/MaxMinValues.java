package fundamentalPrograms;

public class MaxMinValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {34,23,56,22};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max>a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println(max);

	}

}
