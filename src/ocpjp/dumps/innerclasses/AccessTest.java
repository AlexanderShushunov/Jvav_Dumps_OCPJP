package ocpjp.dumps.innerclasses;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class AccessTest {
    public static void main(String[] args) {
        StaticB staticB = new StaticB();
        staticB.foo();
        InnerB innerB = (new AccessTest()).new InnerB();
        innerB.foo();
    }

    static class StaticA {
        private StaticA() {

        }

        private void foo() {
            System.out.println("static A foo");
        }
    }

    static class StaticB extends StaticA {
        private StaticB() {

        }

        private void foo() {
            super.foo();
        }
    }

    class InnerA {
        private InnerA() {
        }

        private void foo() {
            System.out.println("inner A foo");
        }

        private void boo() {
            System.out.println("inner A boo");
        }
    }

    class InnerB extends InnerA {
        private InnerB() {

        }

        private void foo() {
            super.foo();
            InnerA innerA = new InnerA();
            innerA.boo();
            // access error
            // this.boo();
        }
    }
}
