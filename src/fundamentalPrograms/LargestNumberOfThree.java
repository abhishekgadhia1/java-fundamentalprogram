package fundamentalPrograms;

public class LargestNumberOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1,b=2,c=4;
		
//		if(a>b && a>c)
//		{
//			System.out.println("a is largest");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println("b is largest");
//		}
//		else
//		{
//			System.out.println("c is largest");
//		}
		
		int largest1 = a>b?a:b;
		int largest2 = largest1>c?largest1:c;
		System.out.println("largest number is "+largest2);

	}

}
