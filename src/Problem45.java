import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 2/17/12
 */
public class Problem45 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + Solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static long Solution1() {
        TreeSet<Long> hexNums = Util.GetHexagonalNumbersByCount(100000);
        for(long num : hexNums){
            if(Util.isHexagonalNumber(num)
                    && Util.isPentagonalNumber(num)
                    && Util.isTriangleNumber(num)){
                if(num > 40755) return num;
            }
        }
        return 0;
    }
}
