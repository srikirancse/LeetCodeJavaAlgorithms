package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 5/19/2017.
 * Binary Watch
 */
public class Q401 {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == num) res.add(String.format("%d:%02d", i, j));
            }
        }
        return res;
    }
}
