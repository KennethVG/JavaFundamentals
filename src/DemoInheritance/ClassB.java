package DemoInheritance;

/**
 * Created by vangike on 21/03/2017.
 */
public class ClassB extends ClassA {

    public String tekst = "Hello World!";


    public ClassB(){
        System.out.println("Default B!");
    }

    public ClassB(String t, String t2){
        super(0, t);
        System.out.println("IK ZIT IN CLASS B!");
        System.out.println("Tekst 2 = " + t2);
    }

    @Override
    public void mijnAbstracteMethode() {
        System.out.println("Hallo");
    }

    @Override
    public int getGetal() {
        return 10;
    }
}
