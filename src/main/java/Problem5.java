/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/4/11
 */
public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
        //System.out.println("Result is : " + Solution2());
    }

    public static long Solution1() {
        int[] primeNumbers = new int[]{19, 17, 13, 11, 7, 5, 3, 2};
        int[] num = new int[20];
        for (int i = 0; i < 20; i++) {
            num[i] = i + 1;
        }
        long result = 1;
        for (int i = 0; i < 8; i++) {
            boolean flag;
            do {
                flag = false;
                for (int j = 0; j < 20; j++) {
                    if (num[j] != 1 && num[j] % primeNumbers[i] == 0) {
                        num[j] = num[j] / primeNumbers[i];
                        flag = true;
                    }
                }
                if (flag)
                    result = result * primeNumbers[i];
            } while (flag);
        }
        return result;
    }
}
