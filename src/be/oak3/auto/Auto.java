package be.oak3.auto;

public class Auto {

    private String merknaam;
    private Motor motor;
    private String nummerplaat;

    public Auto(String merknaam, String nummerplaat) {
        this.merknaam = merknaam;
        this.nummerplaat = nummerplaat;
        motor = new Motor();
    }

    public Auto(String merknaam) {
        this(merknaam, null);
    }

    public Auto(Auto auto) {
        this(auto.merknaam, auto.nummerplaat);
    }

    public void geefGas() {
        this.geefGas(200);
    }

    public void geefGas(int waarde) {
        motor.verhoogToerental(waarde);
    }

    public void rem() {
        motor.setToerental(0);
    }

    @Override
    public String toString() {
        return merknaam + " met kenteken " + nummerplaat;
    }

    public void toontoerental() {
        System.out.println(motor.getToerental());
    }
}
