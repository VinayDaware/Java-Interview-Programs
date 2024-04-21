
public class reverseEachWordInString {

	public static void main(String[] args) {
		String str = "Welcome to the Java";
		String words[] = str.split(" ");
		String rev = "";
		for (String w : words) {
			String revWords = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				revWords = revWords + w.charAt(i);
			}
			rev = rev + revWords + " ";
		}

		System.out.println(rev);

	}

}
