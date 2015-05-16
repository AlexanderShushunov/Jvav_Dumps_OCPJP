package ocpjp.dumps.cast;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class PrimtiveCast {
    public static void main(String[] args) {
        int v = Integer.MAX_VALUE;
        float f = v;
        int i = (int) f;
        System.out.println(i == v);
        System.out.println(i);
        System.out.println(v);
        System.out.format("f = %11.1f\n", f);
        System.out.println(Integer.MAX_VALUE ==  Integer.MIN_VALUE);
    }
}
