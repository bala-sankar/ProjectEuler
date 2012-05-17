package Utils;

import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.fraction.Fraction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/15/11
 */
public class Util {
    private static final Integer ZERO = 0;

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

    public static HashMap<Long, Long> GetPrimeFactorsWithExponent(long number, TreeSet<Long> primeNums) {
        long limit;
        HashMap<Long, Long> factors = new HashMap<Long, Long>();
        if (number % 2 == 0) {
            limit = number / 2;
        } else {
            limit = number / 3;
        }
        for (long primeNum : primeNums) {
            while (primeNum <= limit && number % primeNum == 0) {
                if (factors.containsKey(primeNum)) {
                    factors.put(primeNum, factors.get(new Long(primeNum)) + 1);
                } else {
                    factors.put(primeNum, 1L);
                }
                number = number / primeNum;
            }
        }
        return factors;
    }

    public static TreeSet<Long> GetPrimeNumsByCount(long count) {
        TreeSet<Long> primeNums = new TreeSet<Long>();
        primeNums.add(2L);
        long i = 3;
        while (primeNums.size() < count) {
            boolean isPrime = isPrimeNumber(i, primeNums);
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
        if (i == 2 && i < limit) {
            primeNums.add(2L);
        }
        if (i % 2 == 0) i++;
        while (i < limit) {
            boolean isPrime = isPrimeNumber(i, primeNums);
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

    public static boolean isPrimeNumber(long i, TreeSet<Long> primeNums) {
        boolean isPrime = true;
        double loop = Math.sqrt((double) i);
        for (long primeNum : primeNums) {
            if (primeNum > loop) break;
            if (i % primeNum == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isPrimeNumber(long num) {
        double loop = Math.sqrt((double) num);
        if (num != 2 && num % 2 == 0) return false;
        for (int i = 3; i <= loop; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static long sum(HashSet<Long> numbers) {
        long sum = 0;
        for (Long number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    public static ArrayList<Integer> GetDigits(long num) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (num > 0) {
            digits.add((int) (num % 10));
            num = num / 10;
        }
        return digits;
    }

    public static ArrayList<Integer> GetDigits(String num) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        for (int i = 0; i < num.length(); i++) {
            digits.add(Integer.valueOf(String.valueOf(num.charAt(i))));
        }
        return digits;
    }

    public static ArrayList<String> GetDigitsString(long num) {
        ArrayList<String> digits = new ArrayList<String>();
        while (num > 0) {
            digits.add(String.valueOf((int) (num % 10)));
            num = num / 10;
        }
        return digits;
    }

    public static int GetUniqueDigitCount(String num) {
        long number = Long.parseLong(num);
        HashSet<Integer> uniqueDigits = new HashSet<Integer>();
        while (number > 0) {
            uniqueDigits.add((int) (number % 10));
            number = number / 10;
        }
        if (uniqueDigits.contains(ZERO)) {
            uniqueDigits.remove(ZERO);
        }
        return uniqueDigits.size();
    }

    /*public static boolean isPanDigital(String num)
    {
        String pattern = "[1-"+num.length()+"]{"+ num.length() + "," + num.length()+"}";
        return num.length() == GetUniqueDigitCount(num) && num.matches(pattern);
    }*/

    public static boolean isPalindrome(long num) {
        return isPalindrome(String.valueOf(num));
    }

    public static boolean isPalindrome(String num) {
        StringBuilder s1 = new StringBuilder().append(num);
        return s1.toString().equals(s1.reverse().toString());
    }

    public static ArrayList<String> GetPermutations(ArrayList<String> numbers) {
        return GetPermutations(numbers, numbers.size());
    }

    public static ArrayList<String> GetPermutations(ArrayList<String> numbers, int length) {
        ArrayList<String> permutations = new ArrayList<String>();
        permutation(numbers, "", permutations, length, 0);
        return permutations;
    }

    public static ArrayList<String> GetPermutationsWithRepetition(ArrayList<String> numbers, int length) {
        ArrayList<String> permutations = new ArrayList<String>();
        permutationWithRepetition(numbers, "", permutations, length, 0);
        return permutations;
    }

    protected static void permutation(ArrayList<String> numbers, String num,
                                      ArrayList<String> permutations, int length, int loop) {
        if (loop == length) {
            permutations.add(num);
            return;
        }
        for (String number : numbers) {
            ArrayList<String> temp = new ArrayList<String>();
            temp.addAll(numbers);
            temp.remove(number);
            permutation(temp, num + number, permutations, length, loop + 1);
        }
    }

    protected static void permutationWithRepetition(ArrayList<String> numbers, String num,
                                                    ArrayList<String> permutations, int length, int loop) {
        if (loop == length) {
            permutations.add(num);
            return;
        }
        for (String number : numbers) {
            permutationWithRepetition(numbers, num + number, permutations, length, loop + 1);
        }
    }

    /* public static ArrayList<String> GetCombination(ArrayList<String> numbers, int length){
            StringBuilder combination;
            ArrayList<String> combinations;
            ArrayList<String> temp = new ArrayList<String>();
            temp.addAll(numbers);
            if(length == numbers.size()){
                combinations = new ArrayList<String>();
                combination = new StringBuilder();
                for(String number: numbers){
                    combination.append(number);
                }
                combinations.add(combination.toString());
                return combinations;
            } else if (length == 1){
                return numbers;
            } else if (length == 0){
                combinations = new ArrayList<String>();
                combinations.add("");
                return combinations;
            }
            combinations = new ArrayList<String>();
            for(String number : numbers){
                if(temp.size() < length) break;

                temp.remove(number);
                int loop = 1;
                combination = new StringBuilder();
                combination.append(number);
                for(String num : temp){
                    combination.append(num);
                    loop++;
                    if(loop == length){
                        combinations.add(combination.toString());
                        combination = new StringBuilder();
                        combination.append(number);
                    }
                }
            }
            return combinations;
        }
    */
    public static TreeSet<Long> GetTriangleNumbersByCount(long count) {
        TreeSet<Long> triangleNums = new TreeSet<Long>();
        for (long i = 1; i <= count; i++) {
            triangleNums.add((i * (i + 1)) / 2);
        }
        return triangleNums;
    }

    public static TreeSet<Long> GetTriangleNumbersByLimit(long limit) {
        TreeSet<Long> triangleNums = new TreeSet<Long>();
        long num, i = 0;
        while (true) {
            num = (i * (i + 1)) / 2;
            if (num < limit) {
                triangleNums.add(num);
                i++;
            } else {
                break;
            }
        }
        return triangleNums;
    }

    /*public static TreeSet<Long> GetSquareNumbersByCount(long count){
        TreeSet<Long> nums = new TreeSet<Long>();
        for(long i = 1 ; i <= count ; i++){
            nums.add(i*i);
        }
        return nums;
    }*/

    public static TreeSet<Long> GetSquareNumbersByLimit(long limit) {
        TreeSet<Long> nums = new TreeSet<Long>();
        long num, i = 0;
        while (true) {
            num = i * i;
            if (num < limit) {
                nums.add(num);
                i++;
            } else {
                break;
            }
        }
        return nums;
    }

    public static TreeSet<Long> GetPentagonalNumbersByCount(long count) {
        TreeSet<Long> nums = new TreeSet<Long>();
        for (long i = 1; i <= count; i++) {
            nums.add((i * (3 * i - 1)) / 2);
        }
        return nums;
    }

    public static TreeSet<Long> GetPentagonalNumbersByLimit(long limit) {
        TreeSet<Long> nums = new TreeSet<Long>();
        long num, i = 0;
        while (true) {
            num = (i * (3 * i - 1)) / 2;
            if (num < limit) {
                nums.add(num);
                i++;
            } else {
                break;
            }
        }
        return nums;
    }

    public static TreeSet<Long> GetHexagonalNumbersByCount(long count) {
        TreeSet<Long> nums = new TreeSet<Long>();
        for (long i = 1; i <= count; i++) {
            nums.add(i * (2 * i - 1));
        }
        return nums;
    }

    public static TreeSet<Long> GetHexagonalNumbersByLimit(long limit) {
        TreeSet<Long> nums = new TreeSet<Long>();
        long num, i = 0;
        while (true) {
            num = i * (2 * i - 1);
            if (num < limit) {
                nums.add(num);
                i++;
            } else {
                break;
            }
        }
        return nums;
    }

    /*public static TreeSet<Long> GetHeptagonalNumbersByCount(long count){
        TreeSet<Long> nums = new TreeSet<Long>();
        for(long i = 1 ; i <= count ; i++){
            nums.add((i*(5*i-3))/2);
        }
        return nums;
    }*/

    public static TreeSet<Long> GetHeptagonalNumbersByLimit(long limit) {
        TreeSet<Long> nums = new TreeSet<Long>();
        long num, i = 0;
        while (true) {
            num = (i * (5 * i - 3)) / 2;
            if (num < limit) {
                nums.add(num);
                i++;
            } else {
                break;
            }
        }
        return nums;
    }

    /*public static TreeSet<Long> GetOctagonalNumbersByCount(long count){
        TreeSet<Long> nums = new TreeSet<Long>();
        for(long i = 1 ; i <= count ; i++){
            nums.add(i*(3*i-2));
        }
        return nums;
    }*/

    public static TreeSet<Long> GetOctagonalNumbersByLimit(long limit) {
        TreeSet<Long> nums = new TreeSet<Long>();
        long num, i = 0;
        while (true) {
            num = i * (3 * i - 2);
            if (num < limit) {
                nums.add(num);
                i++;
            } else {
                break;
            }
        }
        return nums;
    }

    public static boolean isPentagonalNumber(long num) {
        /*
         * Formula derived from Pentagon number equation,
         * 3n^2 - n -2*num = 0, it's a quadratic equation
         * Hence by solving the quadratic formula we get,
         * n = (1 (+/-) sqrt(1+ 24*num))/6
         * Also, n should be a positive integer to be an pentagonal number
         * Therefore, we consider only, n = (1 + sqrt(1+ 24*num))/6
         */
        double root = Math.sqrt(1 + (24 * (double) num));
        return root == (double) (long) root && (1 + root) % 6 == 0;
    }

    public static boolean isTriangleNumber(long num) {
        /*
         * Formula derived from Triangle number equation,
         * n^2 + n - 2*num = 0, it's a quadratic equation
         * Hence by solving the quadratic formula we get,
         * n = (-1 (+/-) sqrt(1+ 8*num))/2
         * Also, n should be a positive integer to be an pentagonal number
         * Therefore, we consider only, n = (-1 + sqrt(1+ 8*num))/2
         */
        double root = Math.sqrt(1 + (8 * (double) num));
        return root == (double) (long) root && (root - 1) % 2 == 0;
    }

    public static boolean isHexagonalNumber(long num) {
        /*
         * Formula derived from Hexagonal number equation,
         * 2n^2 - n - num = 0, it's a quadratic equation
         * Hence by solving the quadratic formula we get,
         * n = (1 (+/-) sqrt(1+ 8*num))/4
         * Also, n should be a positive integer to be an pentagonal number
         * Therefore, we consider only, n = (1 + sqrt(1+ 8*num))/4
         */
        double root = Math.sqrt(1 + (8 * (double) num));
        return root == (double) (long) root && (1 + root) % 4 == 0;
    }

    public static long maxSumPath(int[] triangle) {
        long max = 0;
        int level = 0;
        int start, end, nodes;
        int nodesProcessed = 0;

        while (nodesProcessed < triangle.length) {
            start = (level * (level + 1)) / 2;
            end = start + level;
            nodes = end - start + 1;
            for (int i = start; i <= end; i++) {
                int temp1, temp2;
                temp1 = temp2 = triangle[i];
                if (i != start) {
                    temp1 = triangle[i] + triangle[i - nodes];
                }
                if (i != end) {
                    temp2 = triangle[i] + triangle[i - nodes + 1];
                }
                triangle[i] = temp1 > temp2 ? temp1 : temp2;
                if (max < triangle[i]) {
                    max = triangle[i];
                }
            }
            level++;
            nodesProcessed = (level * (level + 1)) / 2;
        }

        return max;
    }

    public static String sqrtForBigNum(String num) {
        //Validation
        if (null == num || num.length() == 0 || num.split(".").length > 2) {
            throw new IllegalArgumentException("Invalid number");
        }

        StringBuilder number = new StringBuilder();
        String[] parts = num.split("\\.");

        if (parts[0].length() % 2 != 0) {
            number.append(0);
        }
        number.append(parts[0]);
        number.append(".");
        if (parts.length > 1) {
            number.append(parts[1]);
            if (parts[1].length() % 2 != 0) {
                number.append(0);
            }
            number.append("00000000");
        } else {
            number.append("00000000000000");
        }
        StringBuilder p = new StringBuilder();
        long y;
        long c = 0;
        long x;
        int decimalPosition = -1;
        for (int i = 0; i < number.length(); i = i + 2) {
            String digit = number.substring(i, i + 2);
            if (digit.startsWith(".")) {
                i = i + 1;
                decimalPosition = p.length();
                digit = number.substring(i, i + 2);
            }

            if (p.length() == 0) {
                c = Integer.parseInt(digit);
                x = (long) Math.sqrt(c);
                y = x * x;
                c = c - y;
                p.append(x);
            } else {
                long pTemp = Long.parseLong(p.toString());
                StringBuilder cTemp = new StringBuilder();
                cTemp.append(c);
                cTemp.append(digit);
                c = Long.parseLong(cTemp.toString());
                x = findX(c, pTemp);
                y = x * (20 * pTemp + x);
                p.append(x);
                c = c - y;
            }
            if (c < 0 || y < 0 || x < 0) {
                System.out.println("We have an issue");
            }
/*            if(c == 0){
                
            }
            return p.toString();*/
        }
        if (decimalPosition >= 0) {
            p.insert(decimalPosition, ".");
        }
        return p.toString();
    }

    protected static long findX(long c, long p) {
        long xTemp = c / (20 * p);
        long yTemp = xTemp * (20 * p + xTemp);
        long x = xTemp;
        while (yTemp > c) {
            xTemp--;
            yTemp = xTemp * (20 * p + xTemp);
            x = xTemp;
        }
        while (yTemp <= c) {
            x = xTemp;
            xTemp++;
            yTemp = xTemp * (20 * p + xTemp);
        }
        return x;
    }

    public static String GetContinuedFractions(long i) {
        double sqrt = Math.sqrt(i);
        if (sqrt == (double) (long) sqrt) return "";
        int a = (int) sqrt;
        int limitNum = 0;
        int limitDenom = 0;
        int x = 0;
        int y = 1;
        int v = 1;
        Fraction z;
        StringBuilder sb = new StringBuilder();
        int period = 0;
        while (true) {
            sb.append(a);
            //(c-a) = v((sqrt + x) - ay)/y. Make v/y as a Fraction z. (vx-ay) as t
            z = new Fraction(v, y);
            int t = (z.getNumerator() * x - a * z.getDenominator());

            a = (int) ((z.getDenominator()) / (z.getNumerator() * sqrt + t));
            x = -t;
            y = ((int) (i) - (t * t)) * z.getNumerator();
            v = z.getDenominator();
            if (period == 0) {  //Set the limits
                sb.append(";");
                limitNum = v * x;
                limitDenom = y;
            } else if ((v * x) == limitNum && y == limitDenom) {
                // if you find the same numerator and the denominator,
                // then it means the pattern is repeating. Hence, break the loop.
                break;
            } else {
                sb.append(",");
            }
            period++;
        }
        return sb.toString();
    }

    public static BigFraction GetConvergent(int term, String[] periods, int a0) {
        BigFraction sum = BigFraction.ZERO;
        int length = periods.length;
        for (int k = term; k >= 1; k--) {
            int curPos = (k - 1) % length;
            int temp = Integer.parseInt(periods[curPos]);
            sum = sum.add(temp);
            sum = sum.reciprocal();
        }
        sum = sum.add(a0);
        return sum;
    }
}
