package ocpjp.dumps.overwrite.samefieldname;


/**
 * @author Alexander_Shushunov@epam.com.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("------Child child = new Child()---------");
        Child child = new Child();
        child.staticPrintFields();
        child.printFields();
        child.parentPrintFields();
        child.childPrintFields();
        System.out.println("------Parent parent= new Parent()--------");
        Parent parent= new Parent();
        parent.staticPrintFields();
        parent.printFields();
        parent.parentPrintFields();
        System.out.println("-------Parent childAsParent = new Child()--------");
        Parent childAsParent = new Child();
        childAsParent.staticPrintFields();
        childAsParent.printFields();
        childAsParent.parentPrintFields();
        System.out.println("-------set in child--------");
        child.publicField = "child public field ++";
        child.publicStaticField = "child public static field ++";
        child.staticPrintFields();
        child.printFields();
        child.childPrintFields();
        child.parentPrintFields();
        Parent.staticPrintFields();
        System.out.println("-------set in parent--------");
        parent.publicField = "parent public field ++";
        parent.publicStaticField = "parent public static field ++";
        parent.staticPrintFields();
        parent.printFields();
        parent.parentPrintFields();
        System.out.println("-------set in childAsParent--------");
        childAsParent.publicField = "childAsParent public field ++";
        childAsParent.publicStaticField = "childAsParent public static field ++";
        childAsParent.staticPrintFields();
        childAsParent.printFields();
        childAsParent.parentPrintFields();
    }
}
