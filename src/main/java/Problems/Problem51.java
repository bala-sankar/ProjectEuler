package Problems;

import Utils.Util;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 2/24/12
 */
public class Problem51 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static String solution1() {
        TreeSet<Long> primeNums = Util.GetPrimeNumsByLimit(1000000);
        String startingFamilyValue = "";
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("0");
        nums.add("1");
        nums.add("2");
        nums.add("3");
        nums.add("4");
        nums.add("5");
        nums.add("6");
        nums.add("7");
        nums.add("8");
        nums.add("9");
        nums.add("~");
        int digits = 2;
        int count = 0;

        while (count < 8 && digits <= 8) {
            ArrayList<String> patterns = Util.GetPermutationsWithRepetition(nums, digits);
            for (String pattern : patterns) {
                /*
                 * If the number starts with zero or ends with even number, then do nothing.
                 */
                if (!(pattern.matches("^[1-9,~][0-9,~]*[1,3,5,7,~]+$") && pattern.matches(".*[~]+.*"))) continue;
                count = 0;
                for (char i = '0'; i <= '9'; i++) {
                    String number = pattern.replace('~', i);
                    if (!number.startsWith("0") && primeNums.contains(new Long(number))) {
                        count++;
                        if (count == 1) {
                            startingFamilyValue = number;
                        }
                    }
                }
                if (count >= 8) {
                    //System.out.println(pattern + "\t" + count);
                    break;
                }
            }
            digits++;
        }

        return startingFamilyValue;
    }

    /* private static void test(String pattern) {
        if (!(pattern.matches("^[1-9,~][0-9,~]*[1,3,5,7,~]+$") && pattern.matches(".*[~]+.*"))) {
            System.out.println("False :" + pattern);
        } else {
            System.out.println("True :" + pattern);
        }

    }*/
}
