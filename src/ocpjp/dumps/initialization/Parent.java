package ocpjp.dumps.initialization;

import static ocpjp.dumps.initialization.Util.createString;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Parent {
    private static String parentStaticFiled = createString("Init Parent Static Field");
    static {
        System.out.println("Parent static block");
    }

    private String parentFiled = createString("Init Parent Field");
    {
        System.out.println("Parent init block");
    }
    public Parent() {
        System.out.println("Parent constructor");
    }

}
