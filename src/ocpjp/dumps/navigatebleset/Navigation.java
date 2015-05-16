package ocpjp.dumps.navigatebleset;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Navigation {

    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println("floor bb -" + set.floor("bb")); // like <=
        System.out.println("floor b -" + set.floor("b")); // like <=

        System.out.println("ceiling bb -" + set.ceiling("bb")); // like >=
        System.out.println("ceiling b -" + set.ceiling("b")); // like >=

        System.out.println("lower bb -" + set.lower("bb")); // like <
        System.out.println("lower b -" + set.lower("b")); // like <

        System.out.println("higher bb -" + set.higher("bb")); // like >
        System.out.println("higher b -" + set.higher("b")); // like >
    }
}
