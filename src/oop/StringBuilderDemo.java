package oop;

/**
 * Created by vangike on 20/03/2017.
 */
public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello");
        builder.append("World!");

        System.out.println(builder);

        String s = "Hello" + "World" + "!";
        String s1 = new StringBuilder("Hello").append("World").append("!").toString();




    }


}
