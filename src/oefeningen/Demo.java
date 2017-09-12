package oefeningen;

/**
 * Created by vangike on 20/03/2017.
 */
public class Demo {

    public static void main(String[] args) {

        System.out.println(10 + 10 + " Hello");
        System.out.println("Hello " + (10 + 10));

        int getal = 0;

        while (getal <= 10) {
            System.out.println(++getal);
        }
        for (int i = 0, j = 10; i <= 10 && j >= 0; i *= 2) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; ) {
            i++;
        }


    }
}
