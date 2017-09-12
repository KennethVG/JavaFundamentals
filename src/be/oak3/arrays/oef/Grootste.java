package be.oak3.arrays.oef;

public class Grootste {
	public static void main(String[] args) {
		int[] array1 = { 15, 12, 0, 5, 9, -5, 66, 78, 9, 1 };
		int[] array2 = { 1, 45, 99, 84, 75, -6, 7, 41, 2, 0 };

		int[] grootste = new int[array1.length];

		// GROOTSTE GETAL ZOEKEN IN DE 2 ARRAYS
		for (int i = 0; i < grootste.length; i++) {
			if (array1[i] > array2[i]) {
				grootste[i] = array1[i];
			} else {
				grootste[i] = array2[i];
			}
		}

		// ARRAY AFDRUKKEN
		for (int i : grootste) {
			System.out.print(i + "\t");
		}
	}
}
