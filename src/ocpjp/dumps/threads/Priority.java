package ocpjp.dumps.threads;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Priority {

    public static final String VIP_THREAD_NAME = "first";
    public static final String LOSER_THREAD_NAME = "second";

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
        System.out.println(stat.get(VIP_THREAD_NAME) / stat.get(LOSER_THREAD_NAME));
    }

    public static void main(String[] args) throws Exception {

        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                while (check()) {
                }
            }
        }, VIP_THREAD_NAME);

        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                while (check()) {
                }
            }
        }, LOSER_THREAD_NAME);


        //second.setPriority(Thread.MIN_PRIORITY);
        second.start();
        second.setPriority(Thread.MIN_PRIORITY);
        //first.setPriority(Thread.MAX_PRIORITY);
        first.start();
        first.setPriority(Thread.MAX_PRIORITY);

        second.join();
        first.join();
        printStat();
    }
}
