/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/3/11
 */
public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
        System.out.println("Result is : " + Solution2());
    }

    private static long Solution1() {
        long i = 1, j = 1, k = 1, sum = 0;
        while (k <= 4000000) {
            if (k % 2 == 0) {
                sum = sum + k;
            }
            k = i + j;
            j = i;
            i = k;
        }
        return sum;
    }

    private static long Solution2() {
        long i = 1, j = 1, k, sum = 0;
        k = i + j;
        while (k <= 4000000) {
            sum = sum + k;
            i = j + k;
            j = k + i;
            k = i + j;
        }
        return sum;
    }
}
