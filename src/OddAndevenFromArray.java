
public class OddAndevenFromArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int length = a.length;

		System.out.println("Printing even numbers from array : ");

		for (int i = 0; i <= length - 1; i++) {
			if (a[i] % 2 == 0) {

				System.out.println(a[i]);

			}
		}

		System.out.println("Printing odd numbers from array : ");

		for (int i = 0; i <= length - 1; i++) {

			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}

		}

	}

}
