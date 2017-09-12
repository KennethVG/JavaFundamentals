package be.oak3.dvd;

import java.util.ArrayList;

public class DVDCollection {

	private ArrayList<DVD> dvds = new ArrayList<DVD>();

	public void addDVD(String filmNaam, int from, double tijd) {
		dvds.add(new DVD(filmNaam, from, tijd));
	}

	public void addDVD(DVD dvd) {
		dvds.add(dvd);
	}

	public void toon() {
		for (DVD d : dvds) {
			System.out.println(d);
		}
	}
	
	@Override
	public String toString() {
		return dvds.toString();
	}

	public static void main(String[] args) {
		DVDCollection col = new DVDCollection();
		col.addDVD(new DVD("hal", 203,20.0));
		System.out.println(col);
	}
}
