package ocpjp.dumps.enums;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class ToString {

    enum Type {
        ONE,
        TWO
    }

    public static void main(String[] args) {
        System.out.println(Type.values()[0]);
    }

}
