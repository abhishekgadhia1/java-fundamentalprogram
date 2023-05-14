package fundamentalPrograms;

public class SearchElementLinearly {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,4,6,7,8};
		boolean flag = false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==3)
			{
				System.out.println("elem 3 found at "+i);
				flag = true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("elem not found");
		}
	}

}
