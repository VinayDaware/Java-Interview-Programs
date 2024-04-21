
public class NumberOfCharacterOccuranceinString {

	public static void main(String[] args) {

		String str = "Java is programming language";
		int length = str.length();
		int after_remv_space = str.replace("a", "").length();
		int count = length - after_remv_space;

		System.out.println("Total occurance of 'a' in a string " + count);
	}

}
