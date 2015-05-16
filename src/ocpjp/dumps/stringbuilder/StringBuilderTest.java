package ocpjp.dumps.stringbuilder;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("0123456789");
        stringBuilder.replace(1,1,"xxx");
        System.out.println(stringBuilder);
        stringBuilder = new StringBuilder("0123456789");
        stringBuilder.insert(1, "xxx");
        System.out.println(stringBuilder);
    }
}
