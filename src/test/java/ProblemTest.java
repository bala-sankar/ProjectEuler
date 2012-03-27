import Problems.*;
import junit.framework.Assert;
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
public class ProblemTest {
    private long startTime;
    private static final int TIMEOUT = 60000;
    @Rule
    public TestName name = new TestName();
    @Before
    public void BeforeTest(){
        startTime = System.currentTimeMillis();
    }

    @After
    public void AfterTest(){
        long stopTime = System.currentTimeMillis();
        double elapsedTime = (stopTime - startTime) / 1000.0;
        System.out.println("Time took to run " + name.getMethodName() + ":\t" + elapsedTime);
    }

    @Test(timeout = TIMEOUT)
    public void Problem1Test() {
        long expected = 233168;
        Assert.assertEquals(expected, Problem1.Solution1());
        Assert.assertEquals(expected, Problem1.Solution2());
    }

    @Test(timeout = TIMEOUT)
    public void Problem2Test() {
        long expected = 4613732;
        Assert.assertEquals(expected, Problem2.Solution1());
        Assert.assertEquals(expected, Problem2.Solution2());
    }

    @Test(timeout = TIMEOUT)
    public void Problem3Test() {
        long expected = 6857;
        Assert.assertEquals(expected, Problem3.Solution1());
        Assert.assertEquals(expected, Problem3.Solution2());
    }

    @Test(timeout = TIMEOUT)
    public void Problem4Test() {
        long expected = 906609;
        Assert.assertEquals(expected, Problem4.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem5Test() {
        long expected = 232792560;
        Assert.assertEquals(expected, Problem5.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem6Test() {
        long expected = 25164150;
        Assert.assertEquals(expected, Problem6.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem7Test() {
        long expected = 104743;
        Assert.assertEquals(expected, Problem7.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem8Test() {
        long expected = 40824;
        Assert.assertEquals(expected, Problem8.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem9Test() {
        long expected = 31875000;
        Assert.assertEquals(expected, Problem9.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem10Test() {
        long expected = 142913828922L;
        Assert.assertEquals(expected, Problem10.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem11Test() {
        long expected = 70600674;
        Assert.assertEquals(expected, Problem11.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem12Test() {
        long expected = 76576500;
        Assert.assertEquals(expected, Problem12.Solution2());
    }

    @Test(timeout = TIMEOUT)
    public void Problem13Test() {
        String expected = "5537376230";
        Assert.assertEquals(expected, Problem13.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem14Test() {
        long expected = 837799;
        Assert.assertEquals(expected, Problem14.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem15Test() {
        long expected = 137846528820L;
        Assert.assertEquals(expected, Problem15.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem16Test() {
        long expected = 1366;
        Assert.assertEquals(expected, Problem16.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem17Test() {
        long expected = 21124;
        Assert.assertEquals(expected, Problem17.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem18Test() {
        long expected = 1074;
        Assert.assertEquals(expected, Problem18.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem19Test() {
        long expected = 171;
        Assert.assertEquals(expected, Problem19.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem20Test() {
        long expected = 648;
        Assert.assertEquals(expected, Problem20.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem21Test() {
        long expected = 31626;
        Assert.assertEquals(expected, Problem21.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem22Test() {
        long expected = 871198282;
        Assert.assertEquals(expected, Problem22.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem23Test() {
        long expected = 4179871;
        Assert.assertEquals(expected, Problem23.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem24Test() {
        String expected = "2783915460";
        Assert.assertEquals(expected, Problem24.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem25Test() {
        long expected = 4782;
        Assert.assertEquals(expected, Problem25.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem26Test() {
        long expected = 983;
        Assert.assertEquals(expected, Problem26.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem27Test() {
        long expected = -59231;
        Assert.assertEquals(expected, Problem27.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem28Test() {
        long expected = 669171001;
        Assert.assertEquals(expected, Problem28.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem29Test() {
        long expected = 9183;
        Assert.assertEquals(expected, Problem29.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem30Test() {
        long expected = 443839;
        Assert.assertEquals(expected, Problem30.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem31Test() {
        long expected = 73682;
        Assert.assertEquals(expected, Problem31.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem32Test() {
        long expected = 45228;
        Assert.assertEquals(expected, Problem32.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem33Test() {
        long expected = 100;
        Assert.assertEquals(expected, Problem33.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem34Test() {
        long expected = 40730;
        Assert.assertEquals(expected, Problem34.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem35Test() {
        long expected = 55;
        Assert.assertEquals(expected, Problem35.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem36Test() {
        long expected = 872187;
        Assert.assertEquals(expected, Problem36.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem37Test() {
        long expected = 748317;
        Assert.assertEquals(expected, Problem37.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem38Test() {
        long expected = 932718654;
        Assert.assertEquals(expected, Problem38.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem39Test() {
        long expected = 840;
        Assert.assertEquals(expected, Problem39.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem40Test() {
        long expected = 210;
        Assert.assertEquals(expected, Problem40.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem41Test() {
        long expected = 7652413;
        Assert.assertEquals(expected, Problem41.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem42Test() {
        long expected = 162;
        Assert.assertEquals(expected, Problem42.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem43Test() {
        long expected = 16695334890L;
        Assert.assertEquals(expected, Problem43.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem44Test() {
        long expected = 5482660;
        Assert.assertEquals(expected, Problem44.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem45Test() {
        long expected = 1533776805;
        Assert.assertEquals(expected, Problem45.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem46Test() {
        long expected = 5777;
        Assert.assertEquals(expected, Problem46.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem47Test() {
        long expected = 134043;
        Assert.assertEquals(expected, Problem47.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem48Test() {
        String expected = "9110846700";
        Assert.assertEquals(expected, Problem48.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem49Test() {
        String expected = "296962999629";
        Assert.assertEquals(expected, Problem49.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem50Test() {
        long expected = 997651;
        Assert.assertEquals(expected, Problem50.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem51Test() {
        String expected = "121313";
        Assert.assertEquals(expected, Problem51.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem52Test() {
        long expected = 142857;
        Assert.assertEquals(expected, Problem52.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem53Test() {
        long expected = 4075;
        Assert.assertEquals(expected, Problem53.Solution1());
    }


    @Test(timeout = TIMEOUT)
    public void Problem54Test() {
        long expected = 376;
        Assert.assertEquals(expected, Problem54.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem55Test() {
        long expected = 249;
        Assert.assertEquals(expected, Problem55.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem56Test() {
        long expected = 972;
        Assert.assertEquals(expected, Problem56.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem57Test() {
        long expected = 153;
        Assert.assertEquals(expected, Problem57.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem58Test() {
        long expected = 26241;
        Assert.assertEquals(expected, Problem58.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem59Test() {
        long expected = 107359;
        Assert.assertEquals(expected, Problem59.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem60Test() {
        long expected = 26033;
        Assert.assertEquals(expected, Problem60.Solution1());
    }


    @Test(timeout = TIMEOUT)
    public void Problem61Test() {
        long expected = 28684;
        Assert.assertEquals(expected, new Problem61().Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem62Test() {
        long expected = 127035954683L;
        Assert.assertEquals(expected, Problem62.Solution1());
    }

    @Test(timeout = TIMEOUT)
    public void Problem67Test() {
        long expected = 7273;
        Assert.assertEquals(expected, Problem67.Solution1());
    }
}
