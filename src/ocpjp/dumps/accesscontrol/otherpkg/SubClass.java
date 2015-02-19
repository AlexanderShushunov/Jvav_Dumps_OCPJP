package ocpjp.dumps.accesscontrol.otherpkg;

import ocpjp.dumps.accesscontrol.pkg.VarStorage;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class SubClass extends VarStorage {

    private void foo() {
        protectedValue = 100;
    }

    private void boo() {
        VarStorage varStorage = new VarStorage();
        // wrong
        // varStorage.protectedValue = 100;
    }
}
