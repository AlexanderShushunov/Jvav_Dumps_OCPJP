package ocpjp.dumps.arraydeclaring;

import java.util.Arrays;

/**
 * @author Alexander_Shushunov@epam.com.
 */
public class WithStaticArray {
    static final int[] inited = {100, 200};
    static final int linkToOther[] = new int[]{100, 200};
    static final int[] initInStaticBlock;
    static final int[] createNew = new int[2];
    static final int[] square[] = {{100, 200}, {-100, -200}};


    static {
        initInStaticBlock = new int[2];
        initInStaticBlock[0] = 100;
        initInStaticBlock[1] = 200;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(inited));
        System.out.println(Arrays.toString(initInStaticBlock));
        System.out.println(Arrays.toString(linkToOther));
        System.out.println(Arrays.toString(createNew));
        System.out.println(Arrays.deepToString(square));
    }

}
