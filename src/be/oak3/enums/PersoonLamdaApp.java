package be.oak3.enums;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersoonLamdaApp {

    public static void main(String[] args) {

        List<Persoon> lijst = Arrays.asList(
                new Persoon("Kenneth", 28, "Berlaar", 124567681, Geslacht.MAN),
                new Persoon("Betty", 99, "Leuven", 132764871, Geslacht.VROUW),
                new Persoon("Jef", 83, "Brussel", 876766465, Geslacht.TRANSGENDER));

        lijst.sort((p1, p2) -> p1.getNaam().compareTo(p2.getNaam()));

        Comparator<Persoon> c1 = Persoon::compareTo;
        Comparator<Persoon> c2 = Comparator.comparingInt(Persoon::getLeeftijd);
        lijst.sort(c1.thenComparing(c2).thenComparing(Comparator.naturalOrder()));

        lijst.stream().filter(persoon -> persoon.getLeeftijd() > 30).forEach(System.out::println);

        lijst.stream().map(Persoon::getNaam).forEach(System.out::println);
        int som = lijst.stream().mapToInt(Persoon::getLeeftijd).filter(leeftijd -> leeftijd > 60).sum();
        System.out.println("Som van alle leeftijden= " + som);


        List<Persoon> nieuweLijst = lijst.stream().sorted().filter(persoon -> persoon.getGemeente()
                .startsWith("B")).collect(Collectors.toList());


        Set<Persoon> mijnSet = new TreeSet<>(Comparator.comparingInt(Persoon::getLeeftijd)
                .thenComparingLong(Persoon::getRrn).thenComparing(Persoon::getGemeente));


    }

}
