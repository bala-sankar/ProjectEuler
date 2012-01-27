/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/6/11
 */
public class Problem9 {
    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
        //System.out.println("Result is : " + Solution2());
    }

    private static long Solution1() {
        long product = 0;
        int c, b, a;
        for (c = 1000 / 3; c < 1000; c++) {
            for (b = ((1000 - c) / 2) + 1; b < (1000 - c); b++) {
                a = (1000 - c - b);
                if ((a * a + b * b) == (c * c)) {
                    System.out.println("a, b, c : " + a + ", " + b + ", " + c);
                    product = a * b * c;
                }
            }
        }
        return product;
    }
}
