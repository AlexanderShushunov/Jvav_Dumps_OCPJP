package ocpjp.dumps.initialization;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class AppCreateByReflection {
    public static void main(String[] args) throws Exception {
        Child.class.newInstance();
    }
}
