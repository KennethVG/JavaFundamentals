package be.oak3.fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by vangike on 12/04/2017.
 */
public class FruitList {

    private List<Fruit> fruitList;

    public FruitList() {
        fruitList = new ArrayList<>();
    }

    public void add(Fruit fr) {
        fruitList.add(fr);
    }

    public void sortByPrice() {
        Collections.sort(fruitList);
    }

    public void show() {
        for (Fruit f : fruitList) {
            System.out.println(f);
        }
    }
}
