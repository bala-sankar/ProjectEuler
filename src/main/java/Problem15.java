/**
 * Created by IntelliJ IDEA.
 * User: bsankar
 * Date: 12/12/11
 */
public class Problem15 {
    private static long routes = 0;

    public static void main(String[] args) {
        System.out.println("Result is : " + Solution1());
    }

    public static long Solution1() {
        //start from 0,0
        route(0, 0);
        return routes;
    }

    private static void route(int i, int j) {
        if (i == 20 && j == 20) {
            routes++;
            /*if(routes%1000000==0)
                System.out.println("route count - "+ routes);*/
            return;
        }
        if (j < 20) {
            //Move right
            route(i, j + 1);
        }

        if (i < 20) {
            //move Down
            route(i + 1, j);
        }
    }
}
