package ocpjp.dumps.threads;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Demon {
    public static void main(String[] args) throws Exception {
        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("эта мужыка будет вечной, если поток не демон");
                }
            }
        });
        // try to comment this line
        first.setDaemon(true);
        first.start();
        // try to uncomment this line
        //first.setDaemon(true);
        System.out.println("main end");
    }
}
