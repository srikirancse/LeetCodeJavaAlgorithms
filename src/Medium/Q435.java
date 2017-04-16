package Medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Srikiran Sistla on 4/3/2017.
 */
public class Q435 {
    public int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals.length == 0) return 0;
        class intervalSizeComparator implements Comparator<Interval> {

            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.end-i2.end;
            }
        }
        Arrays.sort(intervals, new intervalSizeComparator());
        int count = 1;
        int end = intervals[0].end;
        for (int i = 1; i < intervals.length ; i++) {
            if (intervals[i].start>=end){
                end = intervals[i].end;
                count++;
            }
        }
        return intervals.length-count;
    }
}
