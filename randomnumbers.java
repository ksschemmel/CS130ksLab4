import java.util.Random;

public class randomnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int num1 = generator.nextInt(8)+3;
		System.out.println("A random integer between 3-10: " + num1);
		int num2 = generator.nextInt(24)+20;
		System.out.println("A random integer between 20-45: " + num2);
		int num3 = generator.nextInt(51)-20;
		System.out.println("A random integer between -20-30: " + num3);	
	}

}