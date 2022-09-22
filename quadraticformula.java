import java.util.Scanner;
public class quadraticformula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the coefficient of x squared: ");
		int a = scan.nextInt();
		System.out.println("Enter the coefficient of x: ");
		int b = scan.nextInt();
		System.out.println("Enter the constant: ");
		int c = scan.nextInt();
		double x1= (-b + (Math.sqrt(Math.pow(b,2))-4));
		double x2= (-b - (Math.sqrt(Math.pow(b,2))-4));
		System.out.println("The root 1 is: " +x1 );
		System.out.println("The root 2 is: " +x2 );
		
		
		
	}

}
