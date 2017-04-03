package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Srikiran Sistla on 3/30/2017.
 */
public class Q347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int n : nums) {
            hmap.put(n, hmap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] l1 = new List[nums.length + 1];
        for (int key : hmap.keySet()) {
            int frequency = hmap.get(key);
            if (l1[frequency] == null) {
                l1[frequency] = new ArrayList<Integer>();
            }
            l1[frequency].add(key);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = l1.length - 1; i >= 0; i--) {
            if (l1[i] != null) {
                int j = 0;
                while (k > 0 && j < l1[i].size()) {
                    result.add(l1[i].get(j));
                    k--;
                    j++;
                }
            }
        }
        return result;

    }
}
