import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 2/28/12
 */
public class Problem52 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + Solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static long Solution1() {
        for (long num = 11; num < 1000000; num++){
            String sortedDigitString =  GetSortedDigitsAsString(num);
            if(sortedDigitString.equals(GetSortedDigitsAsString(2*num)) &&
                    sortedDigitString.equals(GetSortedDigitsAsString(3*num)) &&
                    sortedDigitString.equals(GetSortedDigitsAsString(4*num)) &&
                    sortedDigitString.equals(GetSortedDigitsAsString(5*num)) &&
                    sortedDigitString.equals(GetSortedDigitsAsString(6*num))){
                return num;
            }

        }
        return 0;
    }

    private static String GetSortedDigitsAsString(long num){
        ArrayList<Integer> digits =  Util.GetDigits(num);
        Collections.sort(digits);
        StringBuilder sb = new StringBuilder();
        for(int digit : digits){
            sb.append(digit);
        }
        return sb.toString();
    }
}
