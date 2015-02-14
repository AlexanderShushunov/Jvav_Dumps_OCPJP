package ocpjp.dumps.overwrite.samefieldname;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Parent {

    private static String privateStaticField = "parent private static field";
    private  String privateField = "parent private field";
    public static String publicStaticField = "parent public static field";
    public String publicField = "parent public field";

    public Parent() {
        System.out.println("Parent#Parent");
        System.out.println(privateStaticField);
        System.out.println(privateField);
        System.out.println(publicStaticField);
        System.out.println(publicField);
    }

    public static void staticPrintFields() {
        System.out.println("Parent#staticPrintFields");
        System.out.println(privateStaticField);
        System.out.println(publicStaticField);
    }

    public void printFields() {
        System.out.println("Parent#printFields");
        System.out.println(privateStaticField);
        System.out.println(privateField);
        System.out.println(publicStaticField);
        System.out.println(publicField);
    }

    public void parentPrintFields() {
        System.out.println("Parent#parentPrintFields");
        System.out.println(privateStaticField);
        System.out.println(privateField);
        System.out.println(publicStaticField);
        System.out.println(publicField);
    }
}
