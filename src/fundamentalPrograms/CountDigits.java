package fundamentalPrograms;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach 1
		int n = 1234;
		
		String s = Integer.toString(n);
		
		System.out.println(s.length());
		
		//Approach 2
		long m = 57329579075729L;
		int countt = 0;
		
		while(m!=0) // or m>0
		{
			m = m/10;
			countt++;
		}
		
		System.out.println(countt);
		
		//Approach 3
				int o = 12345;
				
				String str = String.valueOf(o);
				
				
				System.out.println(str.length());
	}

}
