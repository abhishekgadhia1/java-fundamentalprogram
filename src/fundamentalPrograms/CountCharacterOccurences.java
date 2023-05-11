package fundamentalPrograms;

public class CountCharacterOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach 1
		
//		String s = "abhishek gadhia";
//		int count = 0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)=='h')
//			{
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
		//Approach 2
		
		String s = "abhishek gadhia";
		
		int totalCount = s.length();
		
		int totalCountAfterRemoval = s.replace("a","").length();
		
		int count = totalCount - totalCountAfterRemoval;
		
		System.out.println(count);
		
	}

}
