import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/15/11
 */
public class Util {
    private static final Integer ZERO = 0;
    private static ArrayList<String> permutations = new ArrayList<String>();
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
            double loop = Math.sqrt((double)i);
            for (long primeNum : primeNums) {
                if(primeNum > loop) break;
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
        return Util.GetPrimeNumsByLimit(i, limit, primeNums);
    }


    //Start should be greater than two
    public static TreeSet<Long> GetPrimeNumsByLimit(long start, long limit,
                                                    TreeSet<Long> primeNums) {
        long i = start;
        while (i < limit) {
            boolean isPrime = true;
            double loop = Math.sqrt((double)i);
            for (long primeNum : primeNums) {
                if(primeNum > loop) break;
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

    public static ArrayList<Integer> GetDigits(long num)
    {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while(num > 0){
            digits.add((int)(num%10));
            num = num/10;
        }
        return digits;
    }

    public static int GetUniqueDigitCount(String num)
    {
        long number = Long.parseLong(num);
        HashSet<Integer> uniqueDigits = new HashSet<Integer>();
        while(number > 0){
            uniqueDigits.add((int)(number%10));
            number = number/10;
        }
        if(uniqueDigits.contains(ZERO))
        {
            uniqueDigits.remove(ZERO);
        }
        return uniqueDigits.size();
    }

    public static boolean isPalindrome(long num) {
        return isPalindrome(String.valueOf(num));
    }

    public static boolean isPalindrome(String num) {
        StringBuilder s1 = new StringBuilder().append(num);
        return s1.toString().equals(s1.reverse().toString());
    }

    public static ArrayList<String> GetPermutations(ArrayList<Integer> numbers, String num){
        permutation(numbers, num);
        return permutations;
    }

    private static void permutation(ArrayList<Integer> numbers, String num){
        if(numbers.isEmpty()){
            permutations.add(num);
        }
        for(int number : numbers){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.addAll(numbers);
            temp.remove(new Integer(number));
            permutation(temp, num + number);
        }
    }
}
