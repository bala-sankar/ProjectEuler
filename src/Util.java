import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/15/11
 */
public class Util {

    //Optimize the GetFactors algorithm
    public static HashSet<Long> GetFactors(long number) {
        int incr;
        long limit;
        HashSet<Long> factors = new HashSet<Long>();
        factors.add(1L);
        factors.add(number);
        if (number % 2 == 0) {
            factors.add(2L);
            incr = 1;
            limit = number / 2;
        } else {
            incr = 2;
            limit = number / 3;
        }
        for (long j = 3; j <= limit; j = j + incr) {
            if (number % j == 0) {
                factors.add(j);
            }
        }
        return factors;
    }

    public static TreeSet<Long> GetPrimeNumsByCount(long count) {
        TreeSet<Long> primeNums = new TreeSet<Long>();
        primeNums.add(2L);
        long i = 3;
        while (primeNums.size() < count) {
            boolean isPrime = true;
            for (long primeNum : primeNums) {
                if (i % primeNum == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                //System.out.print(" " + i);
                primeNums.add(i);
                /*if (primeNums.size() % 20 == 0) {
                    System.out.println();
                }*/
            }
            i = i + 2;
        }
        return primeNums;
    }

     public static TreeSet<Long> GetPrimeNumsByLimit(long limit) {
        TreeSet<Long> primeNums = new TreeSet<Long>();
        primeNums.add(2L);
        long i = 3;
        while (i < limit) {
            boolean isPrime = true;
            for (long primeNum : primeNums) {
                if (i % primeNum == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                //System.out.print(" " + i);
                primeNums.add(i);
                /*if (primeNums.size() % 20 == 0) {
                    System.out.println();
                }*/
            }
            i = i + 2;
        }
        return primeNums;
    }

    public static long sum(HashSet<Long> numbers) {
        long sum = 0;
        for(Long number : numbers){
            sum = sum + number;
        }
        return sum;
    }
}
