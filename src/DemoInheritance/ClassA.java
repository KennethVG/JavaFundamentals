package DemoInheritance;

/**
 * Created by vangike on 21/03/2017.
 */
public abstract class ClassA {

    public String tekst = "Hallo";

    protected int getal;

    public ClassA(){
        System.out.println("Default A!");
    }

    public ClassA(int g, String t){
        System.out.println("IK ZIT IN CLASS A!");
        System.out.println("Getal= " + g);
        System.out.println("Tekst= " + t);
    }

    public abstract void mijnAbstracteMethode();


    public int getGetal() {
        return getal;
    }

    public void setGetal(int getal) {
        this.getal = getal;
    }
}
