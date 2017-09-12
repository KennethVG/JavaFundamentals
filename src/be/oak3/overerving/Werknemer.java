package be.oak3.overerving;

public class Werknemer extends Persoon {

    private String functie;
    private double salaris;

    private static int count = 0;

    public static final double MIN_SALARIS = 1000;

    public Werknemer(String naam, String voornaam, Adres adres){
        this(naam, voornaam, adres, "Algemeen bediende", 1800);
    }

    public Werknemer(String naam, String voornaam, Adres adres, String functie, double salaris) {
        super(naam, voornaam, adres);
        this.functie = functie;
        setSalaris(salaris);
        count++;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris< MIN_SALARIS? MIN_SALARIS :salaris;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getFunctie() + " \nSalaris: " + getSalaris();
    }
}
