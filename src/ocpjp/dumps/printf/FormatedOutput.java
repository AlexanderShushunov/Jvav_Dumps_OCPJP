package ocpjp.dumps.printf;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class FormatedOutput {
    public static void main(String[] args) {
        System.out.printf("%f\n", 22.); // only float and double
        System.out.printf("%b\n", "whatever"); // it is true, if it is not null or false
        // (
        System.out.printf("%(d+10\n", -2);
        System.out.printf("%d+10\n", -2);
        System.out.printf("%(d+10\n", 2);
    }
}
