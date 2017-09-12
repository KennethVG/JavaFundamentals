package be.oak3.io;

/**
 * Created by vangike on 24/03/2017.
 */
public class Film {

    private String filmgegevens;

    public Film(String filmgegevens) {
        this.filmgegevens = filmgegevens;
    }

    public String getFilmgegevens() {
        return filmgegevens;
    }

    public void setFilmgegevens(String filmgegevens) {
        this.filmgegevens = filmgegevens;
    }

    @Override
    public String toString() {
        return getFilmgegevens();
    }
}
