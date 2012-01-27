import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/12/11
 */
public class Problem14 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
    }

    private static long Solution1() {
        HashMap<Long, Long> func = new HashMap<Long, Long>();
        long maxChain = 0;

        for (long i = 1; i < 1000000; i++) {
            long curVal = i, chain = 1;
            while (curVal != 1) {
                if (!func.containsKey(curVal)) {
                    putVal(func, curVal);
                }
                curVal = func.get(curVal);
                chain++;
            }
            if (chain > maxChain) {
                System.out.println("New max chain; " + i + "\t" + chain);
                maxChain = chain;
            }
        }
        return maxChain;
    }

    private static void putVal(HashMap<Long, Long> func, long i) {
        if (i % 2 == 0) {
            func.put(i, (i / 2));
        } else {
            func.put(i, (3 * i) + 1);
        }
    }
}
