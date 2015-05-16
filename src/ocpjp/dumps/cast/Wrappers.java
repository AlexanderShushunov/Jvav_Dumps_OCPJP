package ocpjp.dumps.cast;

import java.lang.reflect.Array;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Wrappers {

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1 == i2);
        i2 = Integer.valueOf(1);
        System.out.println(i1 == i2);
        i2 = new Integer(1);
        System.out.println(i1 == i2);

        Byte b = 1;
        System.out.println(b.equals(i1));
        // System.out.println(b == i1);
    }
}
