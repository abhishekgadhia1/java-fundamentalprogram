package fundamentalPrograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "78728937987#$@#$";
		
		String sr = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(sr);

	}

}
