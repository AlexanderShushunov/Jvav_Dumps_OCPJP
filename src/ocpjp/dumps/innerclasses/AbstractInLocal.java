package ocpjp.dumps.innerclasses;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class AbstractInLocal {

    private int i = 0;
    void foo() {
        abstract class AbsrtactInner {
            void foo() {
                i = 22;
            }
        }
        final class FinalInner {
            void foo() {
                i = 22;
            }
        }
    }
}
