package Problems;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 6/7/12
 */
public class Problem73 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static long solution1() {
        double oneByTwo = (1.0 / 2.0);
        double oneByThree = (1.0 / 3.0);
        HashSet<Double> fraction = new HashSet<Double>();
        for (int d = 1; d <= 12000; d++) {
            for (int n = (int) (oneByThree * d); n <= (int) (oneByTwo * d); n++) {
                double temp = (double) n / (double) d;
                if (temp > oneByThree && temp < oneByTwo) {
                    //System.out.println(n + "/" + d + "~" + temp);
                    fraction.add(temp);
                }
            }
        }
        return fraction.size();
    }
}