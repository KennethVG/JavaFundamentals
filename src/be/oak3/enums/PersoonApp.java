package be.oak3.enums;

import java.time.Instant;
import java.util.*;

import static be.oak3.enums.Geslacht.*;

public class PersoonApp {

    public static void main(String[] args) {

        Persoon kenneth = new Persoon("Kenneth", 28, MAN);
        Persoon betty = new Persoon("Betty", 35, VROUW);
        Persoon alex = new Persoon("Alex", 88, TRANSGENDER);

        Queue<Persoon> personen = new PriorityQueue<>();
        personen.add(kenneth);
        personen.add(betty);
        personen.add(alex);


        for (Persoon p : personen) {
            System.out.println(p);
        }

        List<Persoon> personen1 = new ArrayList<>();
        personen1.add(kenneth);
        personen1.add(betty);
        personen1.add(alex);

        Collections.sort(personen1, new Comparator<Persoon>() {
            @Override
            public int compare(Persoon o1, Persoon o2) {
                return o1.getNaam().compareTo(o2.getNaam());
            }
        });

        for (Persoon p : personen1) {
            System.out.println(p);
        }


        Instant nu = Instant.now();
        for (int i = 0; i < 10000000; i++) {
            personen1.add(new Persoon("Test", i + 100, VROUW));
            personen1.add(new Persoon("Test2", i + 150, MAN));
            personen1.add(new Persoon("Jean" + "Louis", i + 99, TRANSGENDER));
        }
        System.out.println(Instant.now().getEpochSecond() - nu.getEpochSecond());

        Instant nu1 = Instant.now();
        for (int i = 0; i < 10000000; i++) {
            personen.add(new Persoon("Test", i + 100, VROUW));
            personen.add(new Persoon("Test2", i + 150, MAN));
            personen.add(new Persoon("Jean" + "Louis", i + 99, TRANSGENDER));
        }
        System.out.println(Instant.now().getEpochSecond() - nu1.getEpochSecond());


    }

}
