package be.oak3.generics;

/**
 * Created by vangike on 11/04/2017.
 */
public class GenericPrint {


    public static void main(String[] args) {

        int a = 10;
        String s = "hello";
        StringBuilder b = new StringBuilder("Yes!");

        printObject(a);
        printObject(s);
        printObject(b);

        double sum = getSum(10,3,4,5,3,2.3,2.4);
        printObject(sum);
    }

    public static <E> void printObject(E object){
        System.out.println("The object is a(n) " + object.getClass().getSimpleName() + ": " +  object.toString());
    }


    public static <E extends Number> double getSum (E... numbers){
        double sum = 0;
        for (E e: numbers) {
            sum+= e.doubleValue();
        }
        return sum;
    }

}
