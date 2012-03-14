package Problems;

import Utils.Util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/12/11
 */
public class Problem12 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //System.out.println("Result is : " + Solution1());
        //System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
        //startTime = System.currentTimeMillis();
        System.out.println("Result is : " + Solution2());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static long Solution1() {
        long i = 1000;
        long triangleNum = (i * (i + 1)) / 2;
        while (true) {
            i++;
            triangleNum = triangleNum + i;
            HashSet<Long> factors = Util.GetFactors(triangleNum);
            //System.out.println(i + "\t" + triangleNum + "\t" + factors.size());
            if (factors.size() > 500) {
                return triangleNum;
            }
        }
    }

    //Fast solution for larger numbers
    public static long Solution2() {
        long i = 1000;
        long triangleNum = (i * (i + 1)) / 2;
        TreeSet<Long> primeNums = Util.GetPrimeNumsByCount(100000);
        while (true) {
            long size = 1;
            i++;
            triangleNum = triangleNum + i;
            HashMap<Long, Long> factors = Util.GetPrimeFactorsWithExponent(triangleNum, primeNums);
            for(Long primeFactors : factors.keySet()){
                size = size * (factors.get(primeFactors) + 1);
            }
            //System.out.println(i + "\t" + triangleNum + "\t" + size);
            if (size > 500) {
                return triangleNum;
            }
        }
    }

    //Optimize

}
