
public class duplicate_elements_from_array {

	public static void main(String[] args) {

		String arr[] = { "Java", "c++", "C", "Python", "Java" };

		int length = arr.length;
		boolean flag = false;

		for (int i = 0; i <= length - 1; i++) {
			for (int j = i + 1; j <= length - 1; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate elements fond - " + arr[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Duplicate elements not found");
		}
	}

}
