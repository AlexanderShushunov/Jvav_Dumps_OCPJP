package ocpjp.dumps.threads;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Interruption {
    public static void main(String[] args) {
        final Thread demon = createDemon();
        demon.start();

        Thread join = createJoin(demon);
        join.start();
        join.interrupt();

        Thread inf = createInf();
        inf.start();
        inf.interrupt();

        Thread sleep = createSleep();
        sleep.interrupt();

        Thread wait = createWait();
        wait.start();
        wait.interrupt();

        System.out.println("main end");
    }

    private static Thread createDemon() {
        final Thread demon = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    i++;
                }
            }
        });
        demon.setDaemon(true);
        return demon;
    }

    private static Thread createJoin(final Thread demon) {
        Thread join = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    demon.join();
                } catch (InterruptedException e) {
                    System.out.println("join interrupted");
                    System.out.println("isInterrupted() = " + Thread.currentThread().isInterrupted());
                }
                System.out.println("join end");
            }
        });
        return join;
    }

    private static Thread createInf() {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    boolean interrupted = Thread.currentThread().isInterrupted();
                    System.out.println("isInterrupted() = " + interrupted);
                    if (interrupted) {
                        System.out.println("one more time isInterrupted() = " + Thread.currentThread().isInterrupted());
                        System.out.println("Thread.interrupted() = " + Thread.interrupted());
                        System.out.println("one more time Thread.interrupted() = " + Thread.interrupted());
                        break;
                    }
                }
                System.out.println("inf end");
            }
        });
    }


    private static Thread createSleep() {
        Thread sleep = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // millis, nanos
                    Thread.sleep(100000, 100);
                } catch (InterruptedException e) {
                    System.out.println("sleep interrupted");
                    System.out.println("isInterrupted() = " + Thread.currentThread().isInterrupted());
                }
                System.out.println("sleep end");
            }
        });
        sleep.start();
        return sleep;
    }

    private static Thread createWait() {
        final Thread wait = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (this) {
                        wait();
                    }
                } catch (InterruptedException e) {
                    System.out.println("wait interrupted");
                    System.out.println("isInterrupted() = " + Thread.currentThread().isInterrupted());
                }
                System.out.println("wait end");
            }
        });
        return wait;
    }
}
