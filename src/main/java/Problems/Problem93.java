package Problems;

import Utils.Util;

import java.util.ArrayList;

public class Problem93 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static long solution1() {
        ArrayList<String> orderOfExecutionNumber = new ArrayList<String>();
        orderOfExecutionNumber.add("0");
        orderOfExecutionNumber.add("1");
        orderOfExecutionNumber.add("2");
        ArrayList<String> orderOfExecutions = Util.getPermutations(orderOfExecutionNumber);
        ArrayList<String> operators = new ArrayList<String>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        ArrayList<String> arthmeticOperators = Util.getPermutationsWithRepetition(operators, 3);
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        for (String arthmeticOperator : arthmeticOperators) {
            for (String orderOfExecution : orderOfExecutions) {

            }
        }
        return 0;
    }
}
