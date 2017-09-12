package be.oak3.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.ToDoubleFunction;

public class RandomNummers {

    public static void main(String[] args) {

        // Lijst van 100 random int getallen:
        List<Integer> randomLijst = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            randomLijst.add(random.nextInt(101));
        }

        // Alle even getallen afdrukken:
        System.out.println("Alle even getallen: ");
        randomLijst.stream().filter(integer -> integer%2 == 0).forEach(s -> System.out.print(s + " "));

        // Gemiddelde
        double gem = randomLijst.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("\nGemiddelde= " + gem);

        // Som
        int som = randomLijst.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Som= " + som);

        // Alle getallen boven 50 afdrukken:
        System.out.println("Alle getallen boven 50: ");
        randomLijst.stream().filter(integer -> integer>50).forEach((Integer s) -> System.out.print(s + " "));

        // Som van alle oneven getallen:
        int somOneven =randomLijst.stream().mapToInt(Integer::intValue).filter(i -> i%2 !=0).sum();
        System.out.println("\nSom van alle oneven getallen: " + somOneven);

        // Sorteer van groot naar klein:
        System.out.println("Gesorteerde lijst van groot naar klein: ");
        randomLijst.stream().sorted((i1, i2) -> i2-i1).forEach(s -> System.out.print(s + " "));



    }
}
