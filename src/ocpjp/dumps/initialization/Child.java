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

    private String childFiledInitByFoo = publicFoo();

    private String childFiledInitByPrivateFoo = privateFoo();

    {
        System.out.println("Child init block");
    }

    public Child() {
        System.out.println("Child constructor");
    }

    public String publicFoo() {
        System.out.println("child public foo");
        return "filed init by public child foo";
    }

    private String privateFoo() {
        System.out.println("child parent foo");
        return "filed init by private child foo";
    }
}
