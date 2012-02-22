import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/15/11
 */
public class Problem21 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
    }

    private static long Solution1() {
        HashMap<Integer,Long> factorSum = new HashMap<Integer, Long>();
        long pairSum = 0;
        for (int i=1; i<10000; i++){
            long sum;
            HashSet<Long> factors = Util.GetFactors(i);
            factors.remove(new Long(i));
            sum = Util.sum(factors);
            factorSum.put(i, sum);
        }
        for(int i=1; i<10000; i++){
            long value = factorSum.get(i);
            if(value > 0 && value < 10000){
                if(value!=i && factorSum.get((int)value) == i){
                    pairSum = pairSum + i;
                }
            }
        }
        return pairSum;
    }


}
