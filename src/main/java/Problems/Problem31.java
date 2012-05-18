package Problems;

import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 1/23/12
 */
public class Problem31 {
    private static long totalCombinations = 0;

    public static void main(String[] args) {
        System.out.println("Result is : " + solution1());
    }

    public static long solution1() {
        TreeSet<Integer> currencies = new TreeSet<Integer>();
        currencies.add(1);
        currencies.add(2);
        currencies.add(5);
        currencies.add(10);
        currencies.add(20);
        currencies.add(50);
        currencies.add(100);
        currencies.add(200);
        combination(currencies, 200, "");
        return totalCombinations;
    }

    private static void combination(TreeSet<Integer> currencies, int limit, String combination) {
        TreeSet<Integer> tempCurrencies = new TreeSet<Integer>();
        tempCurrencies.addAll(currencies);
        for (int currency : currencies) {
            int tempLimit = limit - currency;
            if (tempLimit == 0) {
                //System.out.println(temp);
                totalCombinations++;
            } else if (tempLimit > 0) {
                //System.out.print(currency + " ");
                String temp = combination + " " + currency;
                combination(tempCurrencies, tempLimit, temp);
                tempCurrencies.remove(new Integer(currency));
            }
        }
    }
}
