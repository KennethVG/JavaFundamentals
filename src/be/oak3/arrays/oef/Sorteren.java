package be.oak3.arrays.oef;

import java.util.Arrays;

public class Sorteren {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 8, 7 };
		
		// Array sorteren van klein naar groot
		Arrays.sort(array);

		// Array in omgekeerde volgorde afdrukken (groot naar klein)
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}
