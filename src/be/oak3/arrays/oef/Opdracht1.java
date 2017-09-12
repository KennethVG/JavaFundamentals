package be.oak3.arrays.oef;

import java.util.Arrays;

public class Opdracht1 {

    public static void main(String[] args) {

        int [] mijnArray = new int[20];

        for (int i = 0; i < mijnArray.length ; i++) {
            mijnArray[i] = (i + 1) * 7;
            //System.out.print(mijnArray[i] + " ");
        }

        for (int getal: mijnArray) {
            System.out.print(getal + " ");
        }

        for (int i = mijnArray.length-1; i >=0 ; i--) {
            System.out.println(mijnArray[i]);
        }


        String [] mijnStrings =  {"Java", "C#" , "Progress", "Objective C"};
        for (String t: mijnStrings) {
            System.out.println(t.toUpperCase());
        }

        for (String t: mijnStrings) {
            System.out.println(t);
        }

        Arrays.sort(mijnStrings);

        for (String t: mijnStrings) {
            System.out.println(t);
        }




    }


}
