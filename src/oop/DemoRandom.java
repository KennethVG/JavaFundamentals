package oop;

import java.util.Random;

public class DemoRandom {

    public static void main(String[] args) {

        System.out.println("Random getal= " + geefRandomGetal());

        StringBuilder sb = new StringBuilder("Tekst met spaties");
        sb = new StringBuilder(sb.toString().replace(" ", ""));
        System.out.println(sb);

    }


    private static int geefRandomGetal(){

        Random random = new Random();
        int randomGetal = random.nextInt(11)+ 10;
        return randomGetal;
    }

}
