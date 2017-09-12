package be.oak3.enums;

public class Persoon implements Comparable<Persoon> {

    private String naam;
    private int leeftijd;
    private String gemeente;
    private long rrn;
    private Geslacht geslacht;

    public Persoon(String naam, int leeftijd, String gemeente, long rrn, Geslacht geslacht) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.gemeente = gemeente;
        this.rrn = rrn;
        this.geslacht = geslacht;
    }
    public Persoon(String naam){
        this(naam, 0, Geslacht.MAN);
    }

    public Persoon(String naam, int leeftijd, Geslacht geslacht) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.geslacht = geslacht;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public long getRrn() {
        return rrn;
    }

    public void setRrn(long rrn) {
        this.rrn = rrn;
    }
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(Geslacht geslacht) {
        this.geslacht = geslacht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persoon persoon = (Persoon) o;

        if (leeftijd != persoon.leeftijd) return false;
        if (naam != null ? !naam.equals(persoon.naam) : persoon.naam != null) return false;
        return geslacht == persoon.geslacht;
    }

    @Override
    public int hashCode() {
        int result = naam != null ? naam.hashCode() : 0;
        result = 31 * result + leeftijd;
        result = 31 * result + (geslacht != null ? geslacht.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                ", geslacht=" + geslacht.getAfkorting() +
                '}';
    }

    @Override
    public int compareTo(Persoon persoon) {

        if(this.getLeeftijd() > persoon.getLeeftijd()){
            return 1;
        } else if(this.getLeeftijd() == persoon.getLeeftijd()){
            return 0;
        } else{
            return -1;
        }


        //return this.getNaam().compareTo(persoon.getNaam());
    }
}
