package ocpjp.dumps.enums;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public enum FieldAccess {
    ONE,
    TWO;

    private static int staticField = 0;
    private final static int finalStaticField = 0;
    private int memberField = 0;

    FieldAccess() {
        // error
        // memberField = staticField;

        // ok
        memberField = finalStaticField;
    }
}
