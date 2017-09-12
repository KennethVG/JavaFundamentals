package be.oak3.arrays.oef;

import java.util.Scanner;

public class SnoepAutomaat_arrays {

	public static void main(String[] args) {
		
		int[] waarden = { 200, 100, 50, 20, 10, 5, 2, 1 };
		System.out.println("Geef de kostprijs in euro in: ");
		Scanner sc = new Scanner(System.in);
		double kostprijsInEuro = sc.nextDouble();
		double betaaldInEuro = 2;

		int kostPrijsInCent = (int) (kostprijsInEuro * 100);
		int betaaldInCent = (int) (betaaldInEuro * 100);
		int wisselGeldInCent = (int) betaaldInCent - kostPrijsInCent;

		System.out.println("U krijgt " + wisselGeldInCent
				+ " cent wisselgeld terug:");

		for (int i = 0; i < waarden.length; i++) {
			int muntwaarde = waarden[i];
			int aantal = wisselGeldInCent / muntwaarde;
			System.out.println(aantal + " x " + muntwaarde + "= "
					+ (aantal * muntwaarde));
			wisselGeldInCent -= (aantal * muntwaarde);
		}

		sc.close();

	}

}
