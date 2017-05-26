package Medium;

import java.util.List;

/**
 * Created by Srikiran Sistla on 5/21/2017.
 * Time difference
 */
public class Q539 {
    public int findMinDifference(List<String> timePoints) {

        boolean[] mark = new boolean[60*24];

        for (String s : timePoints){
            String[] time = s.split(":");
            int index = Integer.valueOf(time[0]) * 60 + Integer.valueOf(time[1]);
            if (mark[index]) return 0;
            mark[index] = true;
        }

        int min = Integer.MAX_VALUE, first = Integer.MAX_VALUE, last = 0, prev = 0;
        for (int i = 0; i < 60*24; i++) {
            if (mark[i]){

                if (first != Integer.MAX_VALUE){
                    min = Math.min(min, i - prev);
                }

                first = Math.min(first, i);
                last = Math.max(last, i);
                prev = i;
            }
        }

        min = Math.min(60*24 - first + last, min);

        return min;
    }
}
