package be.oak3.fruit;

/**
 * Created by vangike on 12/04/2017.
 */
public class Grapefruit extends Fruit {

    private String color;

    public Grapefruit(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + color;
    }
}
