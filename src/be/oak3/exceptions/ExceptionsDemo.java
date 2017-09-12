package be.oak3.exceptions;

public class ExceptionsDemo {

    public static void main(String[] args) {
            int getal = Integer.parseInt(args[0]);
            int getal2 = getal / 0;
            System.out.println(getal);
            System.out.println(getal2);


        try {
            doeIets();
        } catch (MijnException e) {
            e.printStackTrace();
        }


    }

    public static void doeIets() throws MijnException{
        System.out.println("Doe iets");
        throw new MijnException("Er is iets misgegaan!");
    }
}
