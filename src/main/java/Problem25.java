import sun.security.krb5.internal.ccache.FileCCacheConstants;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/28/11
 */
public class Problem25 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
    }

    private static long Solution1() {
        return fibonacci();
    }

    private static long fibonacci(){
        BigInteger Fn1 = BigInteger.ONE; //term 1
        BigInteger Fn2 = BigInteger.ONE; //term 2
        BigInteger Fn = BigInteger.ZERO;
        long term = 2;
        while(Fn.toString().length() < 1000)
        {
            //Fn = BigInteger.ZERO;
            Fn = Fn1.add(Fn2);
            Fn1 = Fn2;
            Fn2 = Fn;
            term++;
        }
        return term;
    }
}
