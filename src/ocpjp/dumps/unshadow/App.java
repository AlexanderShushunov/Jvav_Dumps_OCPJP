package ocpjp.dumps.unshadow;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class App {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        System.out.println(s.i);
        System.out.println(((Base)s).i);

    }
}

class Base {
    int i = 0;
}

class SubClass extends Base {
    int i = 1;
}

