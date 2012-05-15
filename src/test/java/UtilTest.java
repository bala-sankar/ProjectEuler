import Utils.Util;
import org.apache.commons.math3.fraction.BigFraction;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 1/30/12
 */
public class UtilTest extends Util {
    private long startTime;
    private static final int TIMEOUT = 60000;
    @Rule
    public TestName name = new TestName();

    @Before
    public void BeforeTest() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void AfterTest() {
        long stopTime = System.currentTimeMillis();
        double elapsedTime = (stopTime - startTime) / 1000.0;
        System.out.println("Time took to run " + name.getMethodName() + ":\t" + elapsedTime);
    }

    @Test(timeout = TIMEOUT)
    public void FindXTest() {
        long c = 52, p = 1;
        long x = findX(c, p);
        System.out.println("1. X = " + x);

        c = 11900;
        p = 141;
        x = findX(c, p);
        System.out.println("2. X = " + x);
    }

    @Test(timeout = TIMEOUT)
    public void sqrtForBigNumTest() {
        String root = sqrtForBigNum("2");
        System.out.println(root);

        root = sqrtForBigNum("4");
        System.out.println(root);
    }

    @Test(timeout = TIMEOUT)
    public void GetContinuedFractionsTest() {
        //String f = GetContinuedFractions(13);
        String[] continuedFraction = Util.GetContinuedFractions(7).split(";");
        int a = Integer.parseInt(continuedFraction[0]);
        String[] periods = continuedFraction[1].split(",");
        BigFraction temp = GetConvergent(0, periods, a);
        System.out.println(temp.getNumerator() + "~" + temp.getDenominator());
    }
}
