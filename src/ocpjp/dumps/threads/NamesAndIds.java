package ocpjp.dumps.threads;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class NamesAndIds {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(getSelfPresenter());
            thread.start();
            thread.join();
        }

        new Thread(getSelfPresenter(), "custom name").start();
        new Thread(getSelfPresenter(), "~!@#$%^&*()_+;:''\"<>/,.\\ VeRy_C U S T O M name!").start();

    }

    private static Runnable getSelfPresenter() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getId());
            }
        };
    }
}
