package Problems;

import Utils.Util;

import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/4/11
 */
public class Problem7 {
    public static void main(String[] args) {
        System.out.println("Result is : " + solution1());
        //System.out.println("Result is : " + Solution2());
    }

    public static long solution1() {
        TreeSet<Long> primeNums = Util.GetPrimeNumsByCount(10001L);
        return primeNums.last();
    }
}
