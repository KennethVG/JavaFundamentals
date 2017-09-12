package be.oak3.auto;

public class Motor {
    private int toerental;
    private static final int MAX_TOERENTAL = 5800;

    public Motor() {

    }

    public void verhoogToerental(int waarde) {
        toerental += waarde;
    }

    public int getToerental() {
        return toerental > MAX_TOERENTAL ? MAX_TOERENTAL : toerental;
    }

    public void setToerental(int toerental) {
        this.toerental = toerental;
    }
}
