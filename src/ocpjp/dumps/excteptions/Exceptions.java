package ocpjp.dumps.excteptions;

import java.io.IOException;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Exceptions {

    public static void main(String[] args) {
        try {
            foo();
        }
//      wrong
//      IOException - checked.
//      catch (IOException e){
//
//      }
        finally {
        }
    }

    static void foo() {

    }
}
