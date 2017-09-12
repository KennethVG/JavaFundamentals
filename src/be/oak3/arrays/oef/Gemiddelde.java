package be.oak3.arrays.oef;

public class Gemiddelde {
	public static void main(String[] args) {

		int[] array = { 5, 4, 3, 8, 7 };
		int[] afwijking = new int[array.length];
		int gemiddelde = 0;
		int som = 0;

		// SOM BEREKENEN
		for (int i = 0; i < array.length; i++) {
			som += array[i];
		}
		System.out.println(som);

		// GEMIDDELDE BEREKENEN
		gemiddelde = som / (array.length);
		System.out.println("Gemiddelde is: " + gemiddelde);

		// AFWIJKING BEREKENEN
		for (int i = 0; i < afwijking.length; i++) {
			System.out.print((afwijking[i] = gemiddelde - array[i]) + "\t");
		}

	}
}
