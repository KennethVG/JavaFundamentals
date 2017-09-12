package be.oak3.lambdas;

@FunctionalInterface
public interface MijnInterface {

    double mijnMethode(double g1, double g2);

    default void doeIets(){
        System.out.println("Hallo");
    }
}
