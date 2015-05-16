package ocpjp.dumps.threads;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class ExceptionInNotMainThread {

    public static void main(String[] args) throws Exception {
        new Thread(new BadTask()).start();
        Thread.sleep(1000);
        System.out.println("main end");
    }

}

class BadTask implements Runnable {

    @Override
    public void run() {
        System.out.println("ups..");
        throw new RuntimeException("by");
    }
}
