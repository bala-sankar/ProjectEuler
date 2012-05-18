package Problems;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 2/2/12
 */
public class Problem39 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static long solution1() {
        HashMap<Integer, Integer> perimeterSolutions = new HashMap<Integer, Integer>();
        for (int i = 1; i < 500; i++) {
            for (int j = i; j < 500; j++) {
                double k = Math.sqrt((i * i) + (j * j));
                if ((double) ((int) k) == k && (i + j + k) <= 1000) {
                    Integer sum = i + j + (int) k;
                    if (perimeterSolutions.containsKey(sum)) {
                        perimeterSolutions.put(sum, perimeterSolutions.get(sum) + 1);
                    } else {
                        perimeterSolutions.put(sum, 1);
                    }
                    //it's a right angled triangle with integral 'C'
                    //System.out.println(i +"\t" + j +"\t" + (int)k +"\t"+ sum );
                }
            }
        }
        int maxValue = 0, maxKey = 0;
        for (Integer key : perimeterSolutions.keySet()) {
            int value = perimeterSolutions.get(key);
            if (maxValue < value) {
                maxValue = value;
                maxKey = key;
            }
        }
        //System.out.println("Max : "+maxKey+"\t"+maxValue);
        return maxKey;
    }
}
