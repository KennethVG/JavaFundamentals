package be.oak3.arrays.oef;

public class Som {

	public static void main(String[] args) {

		// ARRAYS AANMAKEN
		int[] tblRij1 = { 5, 6, 9, 7, 9 };
		int[] tblRij2 = { 6, 4, 2, 1 , 10};

		int[] som = new int[tblRij1.length];

		// BEREKENING MAKEN
		for (int i = 0; i < tblRij1.length; i++) {
			System.out.println(som[i] = tblRij1[i] + tblRij2[i]);

		}
	}

}
