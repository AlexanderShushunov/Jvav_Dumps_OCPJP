package ocpjp.dumps.asserttion;

import ocpjp.dumps.asserttion.disable.DisableAssertions;
import ocpjp.dumps.asserttion.disable.EnableAssertions2;

/**
 * @author Alexander_Shushunov@epam.com.
 * command lines -ea -da:ocpjp.dumps.asserttion.disable... -ea:ocpjp.dumps.asserttion.disable.EnableAssertions2
 */
public class App {
    public static void main(String[] args) {
        try {
            EnableAssertions1.foo();
        } catch (Throwable th) {
            System.out.println(th.getMessage());
        }
        try {
            EnableAssertions2.foo();
        } catch (Throwable th) {
            System.out.println(th.getMessage());
        }
        try {
            DisableAssertions.foo();
        } catch (Throwable th) {
            System.out.println(th.getMessage());
        }
    }
}
