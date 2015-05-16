package ocpjp.dumps.varargs;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Main {

    public static void main(String[]... a) {
        System.out.println("[]");
    }

    public static void main(String... a) {
        System.out.println("...");
    }
}
