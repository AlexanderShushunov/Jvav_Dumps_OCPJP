package ocpjp.dumps.initialization;

import static ocpjp.dumps.initialization.Util.createString;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Child extends Parent {

    private static String childStaticFiled = createString("Init Child Static Field");

    static {
        System.out.println("Child static block");
    }

    private String childFiled = createString("Init Child Field");

    {
        System.out.println("Child init block");
    }

    public Child() {
        System.out.println("Child constructor");
    }
}
