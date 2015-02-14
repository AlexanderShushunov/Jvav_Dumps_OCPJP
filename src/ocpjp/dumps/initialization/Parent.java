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

    private String parentFiledInitByPublicFoo = publicFoo();

    private String parentFiledInitByPrivateFoo = privateFoo();

    {
        System.out.println("Parent init block");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }

    public String publicFoo() {
        System.out.println("public parent foo");
        return "filed init by public parent foo";
    }

    private String privateFoo() {
        System.out.println("private parent foo");
        return "filed init by private parent foo";
    }
}
