package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Srikiran Sistla on 4/30/2017.
 * Most Frequent sub tree sum
 */
public class Q508 {
    HashMap<Integer, Integer> map = new HashMap<>();
    int freq = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> list = new ArrayList<>();
        helper(root);
        for (int key : map.keySet()){
            if (map.get(key) == freq) list.add(key);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i<list.size(); i++) res[i] = list.get(i);
        return res;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;
        int subtreeSum = helper(root.left) + helper(root.right) + root.val;
        map.put(subtreeSum, map.getOrDefault(subtreeSum,0)+1);
        freq = Math.max(freq, map.get(subtreeSum));
        return subtreeSum;
    }
}
