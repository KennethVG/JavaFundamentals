package be.oak3.lambdas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * Created by vangike on 23/03/2017.
 */
public class TestLamdas {

    public static void main(String[] args) {

//        MijnInterface mi = (String bericht) -> System.out.println(bericht);
//        mi.mijnMethode("Test op Lamda's");
//        mi.doeIets();

        MijnInterface mi2 = ((g1, g2) -> g1 + g2);
        System.out.println(mi2.mijnMethode(10,19.9));

        mi2 = ((g1, g2) -> {
            System.out.println("g1: " + g1);
            System.out.println("g2: " + g2);
            return g1 + g2;
        });
        System.out.println(mi2.mijnMethode(11,11.1));

        JButton button = new JButton("Hallo");
        button.addActionListener(e-> System.out.println(e.getActionCommand() + "Hallo"));

        List<String> lijst = new ArrayList<>();
        lijst.add("Dag");
        lijst.add("Wereld");
        lijst.add("!");

        Collections.sort(lijst, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length()-s2.length();
            }
        });

        Collections.sort(lijst, (s1, s2) ->  s1.length()-s2.length()  );






    }
}
