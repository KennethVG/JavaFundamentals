package be.oak3.arrays.oef;

import java.util.Scanner;

/**
 * Created by vangike on 21/03/2017.
 */
public class Opdracht2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Geef een zin: ");
        String zin = input.nextLine();

        String[] woorden = zin.split(" ");
        for (String woord : woorden) {

            System.out.println(woord);
        }


    }


}
