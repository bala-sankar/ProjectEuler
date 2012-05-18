package Problems;

import Utils.Util;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/16/11
 */
public class Problem24 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static String solution1() {
        ArrayList<String> lexicographicPermutations;
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("0");
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add("9");
        lexicographicPermutations = Util.GetPermutations(numbers);
        return lexicographicPermutations.get(999999);
    }
}
