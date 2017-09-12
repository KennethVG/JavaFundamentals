package be.oak3.wrappers;

import java.util.List;

/**
 * Created by vangike on 22/03/2017.
 */
public class WrapperDemo {

    public static void main(String[] args) {

        Integer mijnInteger = new Integer(10);
        System.out.println(mijnInteger);
        Integer int2 = mijnInteger + 10;

        // AUTOBOXING
        int a = new Integer(10);
        Integer b = 10;

        int c = Integer.parseInt("10");
        Integer d = Integer.valueOf("10");

        int getal = 100;
        methode(100);


    }

    // WIDENING
    public static void methode(double getal){
        System.out.println("LONG");
    }

    //AUTOBOXING
    public static void methode(Integer getal){
        System.out.println("INTEGER");
    }
}
