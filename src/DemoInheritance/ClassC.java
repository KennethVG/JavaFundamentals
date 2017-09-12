package DemoInheritance;

/**
 * Created by vangike on 21/03/2017.
 */
public class ClassC extends ClassA {


    public ClassC(){
    }

    public ClassC(int g, String t) {
        super(g, t);
    }

    @Override
    public void mijnAbstracteMethode() {
        System.out.println("hello");
    }
}
