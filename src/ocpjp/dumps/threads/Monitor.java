package ocpjp.dumps.threads;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Monitor {

    private static final Object monitor = new Object();

    public static void main(String[] args) throws Exception {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("illegal start");
                try {
                    illegalMonitorUsage();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("illegal stop");            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("legal start");
                try {
                    legalMonitorUsage();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("legal stop");
            }
        }).start();

        Thread.sleep(1000);
        synchronized (monitor) {
            System.out.println("I have to be first!");
            monitor.notify();
        }
    }

    private static void illegalMonitorUsage() throws Exception {
        synchronized (Monitor.class) {
            monitor.wait();
        }
    }

    private static void legalMonitorUsage() throws Exception {
        synchronized (monitor) {
            monitor.wait();
        }
    }
}
