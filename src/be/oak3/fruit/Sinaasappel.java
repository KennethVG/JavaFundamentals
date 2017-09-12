package be.oak3.fruit;

public class Sinaasappel extends Fruit {

	private boolean soort;

	public Sinaasappel(String naam, double pPKg, boolean soort) {
		super(naam, pPKg);
		this.soort = soort;
	}

	public String toString() {

		if (soort) {
			return super.toString() + "\t" + "Eetappelsien";
		} else {
			return super.toString() + "\t" + "Persappelsien";
		}

	}

}
