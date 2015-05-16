package ocpjp.dumps.initialization;

class One {
    public static final int CONST = 1;

    public static int notConstant = 2;

    static {
        System.out.println("class inited!");
    }
}

public class ClassInitialized {
    public static void main(String[] args) {
        One o = null;
        System.out.println(One.CONST);
        System.out.println(new Object() instanceof One);
        System.out.println(One.notConstant);
    }

}
