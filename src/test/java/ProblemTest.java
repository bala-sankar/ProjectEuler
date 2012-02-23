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

    @Test(timeout = 60000)
    public void Problem1Test() {
        long expected = 233168;
        Assert.assertEquals(expected, Problem1.Solution1());
        Assert.assertEquals(expected, Problem1.Solution2());
    }

    @Test(timeout = 60000)
    public void Problem2Test() {
        long expected = 4613732;
        Assert.assertEquals(expected, Problem2.Solution1());
        Assert.assertEquals(expected, Problem2.Solution2());
    }

    @Test(timeout = 60000)
    public void Problem3Test() {
        long expected = 6857;
        Assert.assertEquals(expected, Problem3.Solution1());
        Assert.assertEquals(expected, Problem3.Solution2());
    }

    @Test(timeout = 60000)
    public void Problem4Test() {
        long expected = 906609;
        Assert.assertEquals(expected, Problem4.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem5Test() {
        long expected = 232792560;
        Assert.assertEquals(expected, Problem5.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem6Test() {
        long expected = 25164150;
        Assert.assertEquals(expected, Problem6.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem7Test() {
        long expected = 104743;
        Assert.assertEquals(expected, Problem7.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem8Test() {
        long expected = 40824;
        Assert.assertEquals(expected, Problem8.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem9Test() {
        long expected = 31875000;
        Assert.assertEquals(expected, Problem9.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem10Test() {
        long expected = 142913828922L;
        Assert.assertEquals(expected, Problem10.Solution1());
    }
}
