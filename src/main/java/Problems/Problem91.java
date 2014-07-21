package Problems;

import Utils.Util;

import java.util.ArrayList;

public class Problem91 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Result is : " + solution1());
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) / 1000.0);
    }

    public static long solution1() {
        int n = 50;
        ArrayList<String> coordinates = new ArrayList<String>();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                coordinates.add("," + i + "," + j + ",");
            }
        }
        ArrayList<String> triangleCoords = Util.getCombination(coordinates, 2);
        long counter = 0;
        for (String triangleCoord : triangleCoords) {
            //String parsedCoord = triangleCoord.replaceAll("\\|\\|", ",").replaceAll("\\|", "");
            String[] points = triangleCoord.split(",");
            int x1 = Integer.parseInt(points[1]);
            int y1 = Integer.parseInt(points[2]);
            int x2 = Integer.parseInt(points[4]);
            int y2 = Integer.parseInt(points[5]);
            long sideASqr = (x1 * x1) + (y1 * y1);
            long sideBSqr = (x2 * x2) + (y2 * y2);
            long sideCSqr = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
            if ((sideCSqr == (sideASqr + sideBSqr))
                    || (sideBSqr == (sideASqr + sideCSqr))
                    || (sideASqr == (sideBSqr + sideCSqr))) {
                counter++;
            }
        }
        return counter;
    }
}
