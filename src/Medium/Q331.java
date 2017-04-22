package Medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Srikiran Sistla on 4/17/2017.
 * House Robber 3 its dfs not bfs!
 */
public class Q331 {
    public int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0],res[1]);
    }

    private int[] helper(TreeNode root) {
        if (root == null) return new int[2];
        int[] ar = new int[2];
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        ar[0] = left[1] + right[1] + root.val; // root value is included
        ar[1] = Math.max(left[1], left[0]) + Math.max(right[0], right[1]); // root is excluded
        return ar;
    }
}
