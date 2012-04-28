package Problems;

/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 4/12/12
 */
public class Problem66 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + sqrt());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    /*public static long Solution1() {
        int largeX = 0;
        long resultD = 0;
        for(int d = 2; d<=1000; d++){
            double sqrtD = Math.sqrt((double)d);
            if((double)(long)sqrtD == sqrtD) continue;
            BigInteger D= new BigInteger(String.valueOf(d));
            for(int y=1; ; y++){
                BigInteger Y = new BigInteger(String.valueOf(y));
                BigInteger temp = (((Y.multiply(Y)).multiply(D)).add(BigInteger.ONE));
                double diophantineX = Math.sqrt(xSqr);
                BigDecimal d1 = BigDecimal.ONE;

                if(xSqr < 0){
                    System.out.println("We have an issue");
                }
                if((double)(int)diophantineX == diophantineX){
                    if(largeX <= (int)diophantineX){
                        largeX = (int)diophantineX;
                        resultD = d;
                    }
                    //System.out.println((int)diophantineX+"^2-"+d+"*"+y+"^2");
                    break;
                }
*//*                if(y==1000){
                    System.out.println("We have an issue");
                }*//*
            }
        }
        return resultD;
    }*/

    private static String sqrt(){
        return Utils.Util.sqrtForBigNum("12.34");    
    }
}
