package Medium;

import java.util.HashMap;

/**
 * Created by Srikiran Sistla on 4/30/2017.
 * Number of boomerangs
 */
public class Q447 {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int dist = pointDistance(points[i],points[j]);
                map.put(dist, map.getOrDefault(dist, 0)+1);
            }
            for (int val : map.values()) res += val*(val-1);
            map.clear();
        }
        return res;
    }

    private int pointDistance(int[] point1, int[] point2) {
        int d1 = point1[0] - point2[0];
        int d2 = point1[1] - point2[1];
        return d1*d1 + d2*d2;
    }
}
