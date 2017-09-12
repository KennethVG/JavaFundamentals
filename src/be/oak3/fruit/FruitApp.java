package be.oak3.fruit;

public class FruitApp {

    public static Fruit[] fruitSpecies = new Fruit[]{
            new Lemon("Algarve lemon", 3.0),
            new Orange("Jaffa orange", 3.2, true),
            new Orange("Bloodorange", 3.4, true),
            new Grapefruit("Pink grapefruit", 3.1, "pink"),
            new Orange("Juice orange", 2.5, false),
            new Grapefruit("Red grapefruit", 3.3, "red"),
            new Grapefruit("White grapefruit", 2.9, "white"),};


//    public static Fruit[] fruitSoorten = new Fruit[]{
//            new Citroen("Algarve citroen", 3.0),
//            new Sinaasappel("Jaffa appelsien", 3.2, true),
//            new Sinaasappel("BloedAppelsien", 3.4, true),
//            new Pompelmoes("Roze pompelmoes", 3.1, "roze"),
//            new Sinaasappel("Persappelsien", 2.5, false),
//            new Pompelmoes("Rode pompelmoes", 3.3, "rood"),
//            new Pompelmoes("Gele pompelmoes", 2.9, "wit"),};

    public static void main(String[] args) {

        FruitList fruitList = new FruitList();

        for (Fruit fruit : fruitSpecies) {
            fruitList.add(fruit);
        }
        fruitList.sortByPrice();
        fruitList.show();

    }

}
