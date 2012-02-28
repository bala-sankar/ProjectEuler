import java.util.*;

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
        for(long primeNum : primeNums){
            while(primeNum <= limit && number % primeNum == 0){
                if(factors.containsKey(primeNum)){
                    factors.put(primeNum, factors.get(new Long(primeNum)) + 1);
                } else {
                    factors.put(primeNum, 1L);
                }
                number = number/primeNum;
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
        double loop = Math.sqrt((double)i);
        for (long primeNum : primeNums) {
            if(primeNum > loop) break;
            if (i % primeNum == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isPrimeNumber(long num){
        double loop = Math.sqrt((double)num);
        if(num!=2 && num%2==0) return false;
        for (int i=3; i<=loop ; i++) {
            if(num%i==0) return false;
        }
        return true;
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

    public static ArrayList<String> GetDigitsString(long num)
    {
        ArrayList<String> digits = new ArrayList<String>();
        while(num > 0){
            digits.add(String.valueOf((int) (num % 10)));
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

    public static boolean isPanDigital(String num)
    {
        String pattern = "[1-"+num.length()+"]{"+ num.length() + "," + num.length()+"}";
        return num.length() == GetUniqueDigitCount(num) && num.matches(pattern);
    }

    public static boolean isPalindrome(long num) {
        return isPalindrome(String.valueOf(num));
    }

    public static boolean isPalindrome(String num) {
        StringBuilder s1 = new StringBuilder().append(num);
        return s1.toString().equals(s1.reverse().toString());
    }

    public static ArrayList<String> GetPermutations(ArrayList<String> numbers){
        return GetPermutations(numbers, numbers.size());
    }

    public static ArrayList<String> GetPermutations(ArrayList<String> numbers, int length){
        ArrayList<String> permutations = new ArrayList<String>();
        permutation(numbers, "", permutations, length);
        return permutations;
    }

    public static ArrayList<String> GetPermutationsWithRepetition(ArrayList<String> numbers, int length){
        ArrayList<String> permutations = new ArrayList<String>();
        permutationWithRepetition(numbers, "", permutations, length);
        return permutations;
    }

    protected static void permutation(ArrayList<String> numbers, String num,
                                    ArrayList<String> permutations, int length){
        if(num.length() == length){
            permutations.add(num);
            return;
        }
        for(String number : numbers){
            ArrayList<String> temp = new ArrayList<String>();
            temp.addAll(numbers);
            temp.remove(number);
            permutation(temp, num + number, permutations, length);
        }
    }

    protected static void permutationWithRepetition(ArrayList<String> numbers, String num,
                                                  ArrayList<String> permutations, int length){
        if(num.length() == length){
            permutations.add(num);
            return;
        }
        for(String number : numbers){
            permutationWithRepetition(numbers, num + number, permutations, length);
        }
    }

    /*public static ArrayList<String> GetCombination(ArrayList<String> numbers, int length){
        ArrayList<String> combinations = new ArrayList<String>();
        ArrayList<String> temp = new ArrayList<String>();
        temp.addAll(numbers);
        StringBuilder combination = new StringBuilder();
        for(String number : numbers){
            temp.remove(number);
            for(String num : temp){
                combination.append(num);
                if(combination.length()==length){
                    combinations.add(combination.toString());
                }
            }
        }
    }*/
    public static TreeSet<Long> GetTriangleNumbersByCount(long count){
        TreeSet<Long> triangleNums = new TreeSet<Long>();
        for(long i = 1 ; i <= count ; i++){
            triangleNums.add((i*(i+1))/2);
        }
        return triangleNums;
    }

    public static TreeSet<Long> GetPentagonalNumbersByCount(long count){
        TreeSet<Long> nums = new TreeSet<Long>();
        for(long i = 1 ; i <= count ; i++){
            nums.add((i*(3*i-1))/2);
        }
        return nums;
    }

    public static TreeSet<Long> GetHexagonalNumbersByCount(long count){
        TreeSet<Long> nums = new TreeSet<Long>();
        for(long i = 1 ; i <= count ; i++){
            nums.add(i*(2*i-1));
        }
        return nums;
    }

    public static boolean isPentagonalNumber(long num){
        /*
         * Formula derived from Pentagon number equation,
         * 3n^2 - n -2*num = 0, it's a quadratic equation
         * Hence by solving the quadratic formula we get,
         * n = (1 (+/-) sqrt(1+ 24*num))/6
         * Also, n should be a positive integer to be an pentagonal number
         * Therefore, we consider only, n = (1 + sqrt(1+ 24*num))/6
         */
        double root = Math.sqrt(1+(24*(double)num));
        return root == (double) (long) root && (1 + root) % 6 == 0;
    }

    public static boolean isTriangleNumber(long num){
        /*
         * Formula derived from Triangle number equation,
         * n^2 + n - 2*num = 0, it's a quadratic equation
         * Hence by solving the quadratic formula we get,
         * n = (-1 (+/-) sqrt(1+ 8*num))/2
         * Also, n should be a positive integer to be an pentagonal number
         * Therefore, we consider only, n = (-1 + sqrt(1+ 8*num))/2
         */
        double root = Math.sqrt(1+(8*(double)num));
        return root == (double) (long) root && (root - 1) % 2 == 0;
    }

    public static boolean isHexagonalNumber(long num){
        /*
         * Formula derived from Hexagonal number equation,
         * 2n^2 - n - num = 0, it's a quadratic equation
         * Hence by solving the quadratic formula we get,
         * n = (1 (+/-) sqrt(1+ 8*num))/4
         * Also, n should be a positive integer to be an pentagonal number
         * Therefore, we consider only, n = (1 + sqrt(1+ 8*num))/4
         */
        double root = Math.sqrt(1+(8*(double)num));
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
}
