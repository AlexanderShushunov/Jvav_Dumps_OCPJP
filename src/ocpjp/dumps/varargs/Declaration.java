package ocpjp.dumps.varargs;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Declaration {

    private static void foo(String... strs) {
    }

    private static void shortFoo(String... strs) {
    }


    private static void boo(int i, String... strs) {
    }

    // Varargs can be used only in the final argument position
    // private static void wrongBoo(String ... strs, int i) {}

    private static void autoBoxing(Integer... is) {
        for (int i : is) {
            System.out.print(i);
        }
        System.out.println();
    }

    private static void trickyAutoBoxing(int firstArg, Integer... is) {
        for (int i : is) {
            System.out.print(i);
        }
        System.out.println();
    }

    /*
    private static void overload(int i) {
        System.out.println("simple");
    }
    */

    private static void overload(Integer i) {
        System.out.println("autboxing");
    }

    private static void overload(int... is) {
        System.out.println("vararg");
    }

    /*
    The same as the prev
    private static void overload(int[] is) {
        System.out.println("vararg");
    }
    */

    public static void array(String[]... args) {

    }

    /*
    public static void wrongArray(String... args[]) {

    }
    */

    public static void main(String[] args) {
        autoBoxing(0, 2, 4, 6, 8);
        autoBoxing(1, new Integer(3), 5, new Integer(7), 9);
        trickyAutoBoxing(new Integer(-1), -2, -3);
        overload(33);
        overload(new int[]{1, 2, 3});
    }
}