import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/12/11
 */
public class Problem12 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
    }

    private static long Solution1() {
        long i = 1000;
        long triangleNum = (i * (i + 1)) / 2;
        while (true) {
            i++;
            triangleNum = triangleNum + i;
            HashSet<Long> factors = Util.GetFactors(triangleNum);
            System.out.println(i + "\t" + triangleNum + "\t" + factors.size());
            if (factors.size() > 500) {
                break;
            }
        }
        return triangleNum;
    }

    //Optimize

}
