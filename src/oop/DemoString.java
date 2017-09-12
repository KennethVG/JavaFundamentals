package oop;

/**
 * Created by vangike on 20/03/2017.
 */
public class DemoString {

    public static void main(String[] args) {
        System.out.println(stringHoofdletters("Kenneth"));

        String hello1 = new String("Hello World!");
        String hello2 = "Hello World!";
        String hello3= "Hello World!";

        if(hello2 == hello3)
            System.out.println("Het is gelijk!");
        else
            System.out.println("Niet gelijk");

        if(hello2.equals(hello3))
            System.out.println("Gelijk!");
    }

    private static String stringHoofdletters(String tekst){
        return tekst.toUpperCase();
    }

}
