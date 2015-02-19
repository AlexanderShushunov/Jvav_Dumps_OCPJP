package ocpjp.dumps.accesscontrol.pkg;

import ocpjp.dumps.accesscontrol.otherpkg.SubClass;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class VarStorage {

    protected int protectedValue;
}

class OtherClass {

    void foo() {
        SubClass subClass = new SubClass();
        // work fine :)
        subClass.protectedValue = 100;

    }
}

