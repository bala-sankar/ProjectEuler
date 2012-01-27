import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 1/26/12
 */
public class Problem32 {
    private static final Integer ZERO = 0;
    private static HashSet<Integer> panDigitalProducts = new HashSet<Integer>();
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + Solution1());
        System.out.println("Time = "+(System.currentTimeMillis()-startTime)/1000.0);
    }

    private static long Solution1() {
        int sum = 0;

        for(int a = 100; a < 10000 ; a++){
            for(int b = 99; b > 0; b--){
                //The Multiplier should be 5 digits
                String multiplier = String.valueOf(a) + String.valueOf(b);
                if(multiplier.length() == 5)
                {
                    int product = a * b;
                    String prod = multiplier + String.valueOf(product);
                    if(prod.length() == 9 && GetUniqueDigitCount(prod) == 9)
                    {
                       //System.out.println(a + " * " + b + " = " + product);
                       panDigitalProducts.add(product);
                    }
                }
            }
        }
        for(int panDigitalProduct : panDigitalProducts)
        {
           sum = sum + panDigitalProduct;
        }
        return sum;
    }

    private static int GetUniqueDigitCount(String num)
    {
        long number = Long.parseLong(num);
        HashSet<Integer> uniqueDigits = new HashSet<Integer>();
        while(number > 0){
            uniqueDigits.add((int)(number%10));
            number = number/10;
        }
        if(uniqueDigits.contains(ZERO))
        {
            uniqueDigits.remove(ZERO);
        }
        return uniqueDigits.size();
    }


}
