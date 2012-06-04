import Utils.Util;
import org.apache.commons.math3.fraction.BigFraction;
import org.junit.*;
import org.junit.rules.TestName;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 1/30/12
 */
public class UtilTest extends Util {
    private long startTime;
    private static long overallStartTime;
    private static final int TIMEOUT = 60000;
    @Rule
    public TestName name = new TestName();

    @BeforeClass
    public static void beforeTestClass() {
        overallStartTime = System.currentTimeMillis();
    }

    @AfterClass
    public static void afterTestClass() {
        long stopTime = System.currentTimeMillis();
        double elapsedTime = (stopTime - overallStartTime) / 1000.0;
        System.out.println("Time took to run all the tests in UtilTest:\t" + elapsedTime);
    }

    @Before
    public void beforeTest() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void afterTest() {
        long stopTime = System.currentTimeMillis();
        double elapsedTime = (stopTime - startTime) / 1000.0;
        System.out.println("Time took to run " + name.getMethodName() + ":\t" + elapsedTime);
    }

    @Test(timeout = TIMEOUT)
    public void findXTest() {
        long c = 52, p = 1;
        long expected = 2;
        long x = findX(c, p);
        Assert.assertEquals(expected, x);

        c = 11900;
        p = 141;
        expected = 4;
        x = findX(c, p);
        Assert.assertEquals(expected, x);
    }

    @Test(timeout = TIMEOUT)
    public void sqrtForBigNumTest() {
        String root = sqrtForBigNum("2");
        Assert.assertEquals("1.4142135", root);

        root = sqrtForBigNum("4");
        Assert.assertEquals("2.0000000", root);
    }

    @Test(timeout = TIMEOUT)
    public void getContinuedFractionsTest() {
        //String f = GetContinuedFractions(13);
        String[] continuedFraction = Util.GetContinuedFractions(7).split(";");
        int a = Integer.parseInt(continuedFraction[0]);
        String[] periods = continuedFraction[1].split(",");
        BigFraction temp = GetConvergent(0, periods, a);
        Assert.assertEquals("2~1", temp.getNumerator() + "~" + temp.getDenominator());
    }

/*    @Test(timeout = TIMEOUT)
    public void getFactorCountTest() {
        TreeSet<Long> primeNums = Util.GetPrimeNumsByCount(20);
        for (int i = 2; i <= 12; i++) {
            //System.out.println(i+"~"+getFactorCount(i, primeNums));
        }
    }*/
}
