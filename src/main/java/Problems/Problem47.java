package Problems;

import Utils.Util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 2/21/12
 */
public class Problem47 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static long solution1() {
        TreeSet<Long> primeNums = Util.GetPrimeNumsByLimit(200000);
        HashSet<String> uniqueCombination = new HashSet<String>();
        int distinctPrimeFactors = 4;
        long count = 0;
        for (long i = 1; i < 200000; i++) {
            if (primeNums.contains(i)) {
                count = 0;
                uniqueCombination = new HashSet<String>();
                continue;
            }
            HashMap<Long, Long> primeFactors = Util.GetPrimeFactorsWithExponent(i, primeNums);
            if (primeFactors.size() != distinctPrimeFactors) {
                count = 0;
                uniqueCombination = new HashSet<String>();
                continue;
            }
            HashSet<String> tempCombination = new HashSet<String>();
            boolean isUnique = true;
            for (Long primeFactor : primeFactors.keySet()) {
                String combination = String.valueOf(primeFactor) + "_" + String.valueOf(primeFactors.get(primeFactor));
                tempCombination.add(combination);
                if (uniqueCombination.contains(combination)) {
                    isUnique = false;
                } else {
                    uniqueCombination.add(combination);
                }
            }
            if (!isUnique) {
                uniqueCombination = tempCombination;
                count = 0;
            } else {
                count++;
            }
            if (count == distinctPrimeFactors) return i - (distinctPrimeFactors - 1);
        }
        return 0;
    }
}
