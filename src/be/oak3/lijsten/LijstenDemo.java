package be.oak3.lijsten;

import be.oak3.enums.Persoon;

import java.util.*;

/**
 * Created by vangike on 22/03/2017.
 */
public class LijstenDemo {

    public static void main(String[] args) {

        List<String> lijst = new ArrayList<>();
        lijst.add("Hallo");
        lijst.add("World");
        lijst.add("!");

        List<String> tweedeLijst = Arrays.asList("Hallo", "World", "hbzefhz","");
        Collections.sort(tweedeLijst);

        for (String el: lijst) {
            System.out.println(el);
        }
        lijst.remove(2);

        for (int i = 0; i < lijst.size(); i++) {
            System.out.println(lijst.get(i));
        }

        lijst= new LinkedList<>();


        Set<String> mijnSet = new LinkedHashSet<>();
        mijnSet.add("Hallo");
        mijnSet.add("Hallo");
        mijnSet.add("Wereld");
        mijnSet.add("!");

        for (String el:mijnSet) {
            System.out.println(el);
            System.out.println(el.hashCode());
        }
    }

}
