
public class reverse_String {

	public static void main(String[] args) {

		String str = "Vinay";
		String rev = "";
		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("The reverse string is " + rev);

	}

}
