package ocpjp.dumps.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class RegExpTest {
    public static void main(String[] args) {
        testGreedyReluctantPossessive();
    }

    private static void testGreedyReluctantPossessive() {
        Pattern p = Pattern.compile("\\d+9");
        Matcher m = p.matcher("123456789");
        m.find();
        System.out.println(m.start() + " " + m.group());

        p = Pattern.compile("\\d+?9");
        m = p.matcher("123456789");
        m.find();
        System.out.println(m.start() + " " + m.group());


        p = Pattern.compile("\\d++9");
        m = p.matcher("123456789");
        System.out.println(m.find());
    }
}
