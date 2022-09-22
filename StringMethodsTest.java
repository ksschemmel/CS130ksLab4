
public class StringMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Change is inevitable";
		String s1 = new String ("Change is inevitable");
		String Mutation1, mutation2, mutation3;
		System.out.println("printing the phrase: " +s);
		System.out.println("String length = " +s.length());
		String s2 = "Change is inevitable,";
		String s3 = " except from vending machines";
		Mutation1 = s2.concat(s3);
		System.out.println("Concatenated string =" +Mutation1);
		mutation2 = Mutation1.toUpperCase();
		System.out.println("Changing to upper Case: " + mutation2);
		mutation3 = mutation2.substring(3);
		System.out.println("Return Substring of index 3: " +mutation3);
		System.out.println("String Length of Mutation1 = " +Mutation1.length());
		System.out.println("String Length of mutation2 = " +mutation2.length());
		System.out.println("String Length of mutation3 = " +mutation3.length());
		
		
		
		
	}

}
