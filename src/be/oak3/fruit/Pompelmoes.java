package be.oak3.fruit;

public class Pompelmoes extends Fruit {

	private String kleur;

	public Pompelmoes(String naam, double pPKg, String kleur) {
		super(naam, pPKg);
		this.kleur = kleur;
	}

	public String toString() {
		return super.toString() + "\t" + this.kleur;
	}

}
