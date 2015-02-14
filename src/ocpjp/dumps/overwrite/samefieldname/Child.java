package ocpjp.dumps.overwrite.samefieldname;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Child extends Parent {

    private static String privateStaticField = "child private static field";
    private String privateField = "child private field";
    public static String publicStaticField = "child public static field";
    public String publicField = "child public field";

    public Child() {
        System.out.println("Child#Child");
        System.out.println(privateStaticField);
        System.out.println(privateField);
        System.out.println(publicStaticField);
        System.out.println(publicField);
    }

    public static void staticPrintFields() {
        System.out.println("Child#staticPrintFields");
        System.out.println(privateStaticField);
        System.out.println(publicStaticField);
    }

    public void printFields() {
        System.out.println("Child#printFields");
        System.out.println(privateStaticField);
        System.out.println(privateField);
        System.out.println(publicStaticField);
        System.out.println(publicField);
    }

    public void childPrintFields() {
        System.out.println("Child#childPrintFields");
        System.out.println(privateStaticField);
        System.out.println(privateField);
        System.out.println(publicStaticField);
        System.out.println(publicField);
    }

}
