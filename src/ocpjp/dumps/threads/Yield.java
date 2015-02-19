package ocpjp.dumps.threads;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Yield {

    public static final String COMMON_THREAD_NAME = "first";
    public static final String YIELD_THREAD_NAME = "second";

    private static volatile int count = 0;
    private static volatile Map<String, Integer> stat;

    static {
        stat = new HashMap<String, Integer>();
    }

    public static synchronized boolean check() {
        updateThreadStat(Thread.currentThread().getName());
        count++;
        return count < 1000000;
    }

    private static void updateThreadStat(String threadName) {
        int threadStat = 0;
        if (stat.containsKey(threadName)) {
            threadStat = stat.get(threadName);
        }
        threadStat++;
        stat.put(threadName, threadStat);
    }

    private static void printStat() {
        System.out.println(stat);
        System.out.println("Common thread worked more then yield times:");
        System.out.println(stat.get(COMMON_THREAD_NAME) / stat.get(YIELD_THREAD_NAME));
    }

    public static void main(String[] args) throws Exception {

        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                while (check()) {
                    // do smth to pretend optimisation
                    int i = (int) (Math.random() * 1000000);
                    if (i == 0) {
                        System.out.println("opa!");
                    }
                }
            }
        }, COMMON_THREAD_NAME);

        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                while (check()) {
                    Thread.yield();
                }
            }
        }, YIELD_THREAD_NAME);

        second.start();
        first.start();
        second.join();
        first.join();
        printStat();
    }
}
