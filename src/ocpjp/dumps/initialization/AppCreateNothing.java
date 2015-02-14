package ocpjp.dumps.initialization;

import java.util.Arrays;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class AppCreateNothing {
    public static void main(String[] args) {
        Child child = null;
        Parent parent = child;
        System.out.println(child);
        System.out.println(parent);
        System.out.println(Child.class.getName());
        System.out.println(Arrays.toString(Child.class.getConstructors()));
        System.out.println(Child.class.getSuperclass());
        System.out.println(Child.class.getResource("file"));
    }
}
