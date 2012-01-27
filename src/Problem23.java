import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/16/11
 */
public class Problem23 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
    }

    private static long Solution1() {
        //find all the abundant numbers till 100
        TreeSet<Integer> abundantNumbers  = new TreeSet<Integer>();
        for(int i=1; i<=28123; i++){
            long sum;
            HashSet<Long> factors = Util.GetFactors(i);
            factors.remove(new Long(i));
            sum = Util.sum(factors);
            if(sum > i){
                abundantNumbers.add(i);
            }
        }
        //Find the numbers that can be represented by abundant numbers
        HashSet<Integer> sumOfTwoAbundant = new HashSet<Integer>();
        for(int i : abundantNumbers){
            for(int j : abundantNumbers){
                sumOfTwoAbundant.add((i+j));
            }
        }
        long sum = 0;
        for (int i =1 ; i<=28123; i++){
            if(!sumOfTwoAbundant.contains(new Integer(i))){
                sum = sum + i;
            }
        }
        return sum;
    }
}
