import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/15/11
 */
public class Problem20 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
    }

    private static long Solution1() {
        BigInteger factorial = new BigInteger("1");
        for(int i=100; i> 0; i--){
            factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
        }
        String num = factorial.toString();
        long sum =0;
        for (int i = 0; i< num.length(); i++){
            sum = sum + Long.parseLong(num.substring(i,i+1));
        }
        return sum;
    }
}
