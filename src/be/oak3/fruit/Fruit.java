package be.oak3.fruit;

public abstract class Fruit implements Comparable<Fruit> {

    private String name;
    private double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int compareTo(Fruit fruit) {
        if (price > fruit.price)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return name + "\t" + "€" + price;
    }

}
