package ocpjp.dumps.threads;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class DoubleStart {

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("foo");
            }
        });
        thread.start();
        Thread.sleep(1000);
        // do not start thread twice!
        System.out.println(thread.getState());
        thread.start();

    }
}
