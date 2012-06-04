package Problems;

import Utils.Util;

import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 5/17/12
 */
public class Problem69 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static long solution1() {
        //Fraction maxNByPhi = Fraction.ZERO;
        double maxNByPhi = 0;
        long maxN = 0;
        long nLimit = 1000000;
        TreeSet<Long> primeNums = Util.GetPrimeNumsByLimit(nLimit / 2);
        //TreeSet<Long> primeNums = Util.GetPrimeNumsByCount(35000);
        for (long n = 2; n <= nLimit; n++) {
            double nByPhi;
            double phi = Util.phiFunction(n, primeNums);
            nByPhi = (double) n / phi;
            if (maxNByPhi < nByPhi) {
                //System.out.println(n+"~"+phi+"~"+nByPhi);
                maxNByPhi = nByPhi;
                maxN = n;
            }
        }
        return maxN;
    }
}
