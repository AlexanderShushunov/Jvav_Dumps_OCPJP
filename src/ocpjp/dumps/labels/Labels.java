package ocpjp.dumps.labels;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class Labels {
    public static void main(String... args) {
        crazyLoop();
    }

    static void crazyLoop() {
        JACK:
        for (int i = 0; i < 10; i++) {
            JILL:
            {
                System.out.println(i);
                if (i < 5) {
                    break JILL;
                }
                break JACK;
            }
        }
    }

    void otherCrazyLoop() {
        int c = 0;
        JACK:
        while (c < 8) {
            JILL:
            System.out.println(c);
            if (c > 3) break JACK;
            else c++;
        }
    }
}
