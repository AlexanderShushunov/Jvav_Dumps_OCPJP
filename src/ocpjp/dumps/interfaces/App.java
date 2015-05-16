package ocpjp.dumps.interfaces;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class App {
}

interface I1 {
    void foo();
}

interface I2 {
    void foo();
}

interface I3 {
    int foo();
}

class A implements I1, I2 {

    @Override
    public void foo() {
        // it is ok
    }
}



// error
/*
class B implements I1, I3 {

}
*/
