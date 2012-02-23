import junit.framework.Assert;
import org.junit.*;
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

    @Test(timeout = 60000)
    public void Problem11Test() {
        long expected = 70600674;
        Assert.assertEquals(expected, Problem11.Solution1());
    }

    @Ignore
    @Test(timeout = 60000)
    public void Problem12Test() {
        long expected = 76576500;
        Assert.assertEquals(expected, Problem12.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem13Test() {
        String expected = "5537376230";
        Assert.assertEquals(expected, Problem13.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem14Test() {
        long expected = 837799;
        Assert.assertEquals(expected, Problem14.Solution1());
    }

    @Ignore
    @Test(timeout = 60000)
    public void Problem15Test() {
        long expected = 137846528820L;
        Assert.assertEquals(expected, Problem15.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem16Test() {
        long expected = 1366;
        Assert.assertEquals(expected, Problem16.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem17Test() {
        long expected = 21124;
        Assert.assertEquals(expected, Problem17.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem18Test() {
        long expected = 1074;
        Assert.assertEquals(expected, Problem18.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem19Test() {
        long expected = 171;
        Assert.assertEquals(expected, Problem19.Solution1());
    }

    @Test(timeout = 60000)
    public void Problem20Test() {
        long expected = 648;
        Assert.assertEquals(expected, Problem20.Solution1());
    }
}
