package ocpjp.dumps.construtorsandexaptions;

import java.io.IOException;
import java.text.ParseException;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class App {

    public static void main(String[] args) {
        try {
            new SubClass();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

class Base {
    Base() throws IOException {

    }
}

class SubClass extends Base {

    SubClass() throws IOException, ParseException {
        super();
    }
}