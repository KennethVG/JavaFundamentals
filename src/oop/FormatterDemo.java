package oop;

import java.util.Formatter;

/**
 * Created by vangike on 20/03/2017.
 */
public class FormatterDemo {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();
        double getal = 10.27567565443;

        //formatter.format("Mijn getal: %.2f", getal);
        //System.out.println(formatter.toString());

        formatter.format("Boolean: %2$b , character: %1$c" , 'a', false);
        formatter.format("Mijn String: %-20s %-20s" , "Hello", "World");
        System.out.println(formatter.toString());

        String mijnString = String.format("%s", "Hello");
        System.out.printf("%s", "HEllo");

        String g = "10";
        int leeftijd = Integer.parseInt(g);





    }




}
