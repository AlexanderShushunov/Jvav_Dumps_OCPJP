package ocpjp.dumps.varargs;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Overloading {
    public void test() {
        test1();
        test1(10);
        test1(10, 20);
        // wrong. two methods match
        //test1(10, 20, 30);
    }

    public void test1(int i, int... j) {
        System.out.println("1");
    }

    public void test1(int... i) {
        System.out.println("2");
    }

    public void test1(int i, int j) {
        System.out.println("3");
    }

    public void test1(int i) {
        System.out.println("4");
    }

    public void test1() {
        System.out.println("5");
    }

    public static void main(String[] args) {
        new Overloading().test();
    }
}
