package Problems;

import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/6/11
 */
public class Problem10 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
        //System.out.println("Result is : " + Solution2());
    }

    public static long Solution1() {
        TreeSet<Long> primeNums = new TreeSet<Long>();
        primeNums.add(2L);
        long i = 3;
        long sum = 2;
        while (i < 2000000) {
            boolean isPrime = true;
            long sqrt = (long) Math.sqrt((double) i);
            for (long primeNum : primeNums) {
                if (primeNum > sqrt) {
                    break;
                }
                if (i % primeNum == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                //System.out.print(" " + i);
                primeNums.add(i);
                sum = sum + i;
                /*if (primeNums.size() % 20 == 0) {
                    //System.out.println();
                }*/
            }

            i = i + 2;
        }
        return sum;
    }
}
