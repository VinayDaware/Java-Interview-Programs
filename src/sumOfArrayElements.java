
public class sumOfArrayElements {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		int length = a.length;

		for (int i = 0; i <= length - 1; i++) {
			sum = sum + a[i];
		}

		System.out.println("Sum of array elements is :" + sum);

	}

}
