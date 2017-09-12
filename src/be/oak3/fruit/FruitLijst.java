package be.oak3.fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitLijst {

    private List<Fruit> fruitLijst;

    public FruitLijst() {
        fruitLijst = new ArrayList<>();
    }

    public void add(Fruit fr) {
        fruitLijst.add(fr);
    }

    public void sorteerVolgensPrijs() {
        Collections.sort(fruitLijst);
    }

    public void toon() {
        for (Fruit f : fruitLijst) {
            System.out.println(f);
        }
    }
}
