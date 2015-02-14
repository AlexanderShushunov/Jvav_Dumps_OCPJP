package ocpjp.dumps.overwrite.sameinnerclassname;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class InnerClassesWithSameNames {
    public class A {
        public void foo() {
            System.out.println("member inner classes");
        }
    }

    public void callInnerFoo() {
        class A {
            public void foo() {
                System.out.println("local inner classes");
            }
        }
        new A().foo();
    }
}
