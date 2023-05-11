package fundamentalPrograms;

import java.util.Random;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Math.random());
		
		Random r = new Random();
		int num = r.nextInt(444);
		System.out.println(num);
		

	}

}
