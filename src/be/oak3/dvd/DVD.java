package be.oak3.dvd;

public class DVD {
	private String filmNaam;
	private int from;
	private double tijd;

	public DVD(String filmNaam, int from, double tijd) {
		this.filmNaam = filmNaam;
		this.from = from;
		this.tijd = tijd;
	}

	@Override
	public String toString() {
		return "DVD [filmNaam=" + filmNaam + ", from=" + from + ", tijd="
				+ tijd + "]";
	}

}
