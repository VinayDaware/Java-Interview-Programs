
public class no_of_words_in_String {

	public static void main(String[] args) {

		String str = "Welcome to java";
		int length = str.length();
		int count = 1;

		for (int i = 0; i <= length - 1; i++) {

			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {

				count++;

			}
		}
		System.out.println("The numbers of characters in string : " + count);

	}

}
