package Final.AbstractAndInterface;

public class Main extends Abs implements Inter{

    public void test(){
        System.out.println("Test1");
    }
    public void test3(){
        System.out.println("TEst3");
    }

    public static void main(String[] args) {
        Main t = new Main();

        t.test2();
        t.test3();
        t.test();
    }

}
