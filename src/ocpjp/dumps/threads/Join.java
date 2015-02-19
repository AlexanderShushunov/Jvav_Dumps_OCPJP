package ocpjp.dumps.threads;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Join {

    public static void main(String[] args) throws Exception {
        final Thread longThread = new Thread(new Runnable() {
            @Override
            public void run() {
                long r = 0;
                for (long i = 0; i < (long)Math.pow(10, 7); i++) {
                    if (i%2 == 0) {
                        r += i;
                    } else {
                        r -= i;
                    }
                }
                System.out.println("longThread end " + r);
            }
        });
        longThread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    longThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("otherThread end");
            }
        }).start();
        System.out.println("main end");
    }
}
