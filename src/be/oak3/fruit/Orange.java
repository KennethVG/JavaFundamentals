package be.oak3.fruit;

/**
 * Created by vangike on 12/04/2017.
 */
public class Orange extends Fruit {

    private boolean type;

    public Orange(String name, double price, boolean type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + (type ? "Orange to eat" : "Juice Orange");
    }
}
