package Problems;

import Utils.Util;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/4/11
 */
public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Result is : " + solution1());
        //System.out.println("Result is : " + Solution2());
    }

    public static long solution1() {
        long max = 0;
        for (int num1 = 999; num1 >= 100; num1--) {
            for (int num2 = 999; num2 >= num1; num2--) {
                long product = num1 * num2;
                if (product <= max) {
                    break;
                }
                if (Util.isPalindrome(product)) {
                    max = product;
                }
            }
        }
        return max;
    }
}
