
public class palindrome_string {

	public static void main(String[] args) {
		
		String str = "MADAM";
		String rev = "";
		int length = str.length();
		for (int i = length-1; i >= 0; i--)
		
	if(str.equals(rev)) {
			System.out.println(str+ " is palindrome string");
		}
		else {
			System.out.println(str+ " is not palindrome string");
		}

	}

}
