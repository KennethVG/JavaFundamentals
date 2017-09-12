package be.oak3.auto;
public class AutoTester {
    public static void main(String[] args) {

        Auto auto = new Auto("VW Golf", "BHZ456");
        System.out.println("Test van : " + auto);
        for(int i = 0; i < 30; i++) {
            auto.geefGas();
            auto.toontoerental();
        }
        System.out.println("REMMEN");
        auto.rem();
        for(int i = 0; i < 3; i++) {
            auto.geefGas(3000);
            auto.toontoerental();
        }

        Auto kopie= new Auto(auto);
        System.out.println("\nkopie: " + kopie);
    }
}

