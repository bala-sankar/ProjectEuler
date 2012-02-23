import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/12/11
 */
public class Problem12 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
    }

    public static long Solution1() {
        TreeSet<Long> triangleNums = Util.GetTriangleNumbersByCount(100000);
        //long triangleNum = (i * (i + 1)) / 2;
        for(long triangleNum : triangleNums){
            HashSet<Long> factors = Util.GetFactors(triangleNum);
            //System.out.println(i + "\t" + triangleNum + "\t" + factors.size());
            if (factors.size() > 500) {
                return triangleNum;
            }
        }
        return 0;
    }
}
