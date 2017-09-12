package oefeningen;

import java.util.Scanner;

/**
 * Created by vangike on 20/03/2017.
 */
public class Oefening4 {

    public static void main(String[] args) {

        double r1, r2, r3, r4;
        Scanner input = new Scanner(System.in);

        System.out.print("Uw score voor java basis: ");
        r1 = input.nextDouble();
        System.out.print("Uw score voor java gevorderd: ");
        r2 = input.nextDouble();
        System.out.print("Uw score voor jdbc: ");
        r3 = input.nextDouble();
        System.out.print("Uw score voor javaFX: ");
        r4 = input.nextDouble();

        double som = r1 + r2 + r3 + r4;
        float gemiddelde = (float) (som / 4);
        System.out.println("Gemiddelde= " + gemiddelde);
        System.out.println("In Procent= " + (gemiddelde / 20) * 100 + "%");


    }

}
