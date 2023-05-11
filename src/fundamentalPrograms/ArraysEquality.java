package fundamentalPrograms;

public class ArraysEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3};
		int b[] = {1,2,4,3};
		
		boolean flag = true;
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					flag = false;
					break;
				}
			}
			
			if(flag==true)
			{
				System.out.println("yes equal");
			}
			else
			{
				System.out.println("no equal");
			}

		}
		else
		{
			System.out.println("diff elems");
		}
		
		
	}

}
