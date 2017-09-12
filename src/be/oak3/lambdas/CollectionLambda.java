package be.oak3.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class CollectionLambda {

    public static void main(String[] args) {

        List<String> lijst = new ArrayList<>();
        lijst.add("Dag");
        lijst.add("Wereld");
        lijst.add("!");

        lijst.forEach(s -> System.out.println(s));
        lijst.forEach(System.out::println);

        lijst.sort((s1, s2) -> s1.length() - s2.length());
        lijst.sort(Comparator.comparingInt(s -> s.length()));
        lijst.sort(Comparator.naturalOrder());

        lijst.sort(Comparator.comparing(String::toUpperCase));
        lijst.forEach(System.out::println);

        lijst.sort(Comparator.comparing(s -> s.length()));
        lijst.sort(Comparator.reverseOrder());
        lijst.forEach(System.out::println);


    }

}
