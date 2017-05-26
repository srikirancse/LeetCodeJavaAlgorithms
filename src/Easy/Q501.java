package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Srikiran Sistla on 3/30/2017.
 */
public class Q501 {
    private HashMap<Integer, Integer> map = new HashMap<>();
    private int max = 0;
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        inorder(root);
        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()){
            if (map.get(key) == max) list.add(key);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }

    private void inorder(TreeNode root) {
        if (root.left!=null) inorder(root.left);
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        max = Math.max(max, map.get(root.val));
        if (root.right!=null) inorder(root.right);
    }
}
