package be.oak3.lijsten;

/**
 * Created by vangike on 23/03/2017.
 */
public class WoordenBoekApp {

    public static void main(String[] args) {

        Woordenboek boek = new Woordenboek("sql", "Structured Query Language");
        boek.voegWoordToe("orm", "Object Relational Mapping");
        boek.voegWoordToe("jre", "Java Runtime Environment");
        boek.voegWoordToe("jre", "Java Runtime Environment");

        System.out.println("Aantal woorden: " + boek.getGrootte());
        System.out.println(boek);

    }

}
