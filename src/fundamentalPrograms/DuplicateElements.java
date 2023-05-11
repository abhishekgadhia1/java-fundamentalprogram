package fundamentalPrograms;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,2,3};
		boolean flag = false;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate found : "+a[i]+" at "+i);
					flag = true;
					break;	
				}
				
			}
		}
		if(flag==false)
		{
			System.out.println("no duplicate");
		}
	}

}
