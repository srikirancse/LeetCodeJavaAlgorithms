package Medium;

/**
 * Created by Srikiran Sistla on 4/17/2017.
 * House Robber 3 its dfs not bfs!
 */
public class Q337 {
    public int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
    }

    private int[] helper(TreeNode root) {
        if (root == null) return new int[2];
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int[] rootArray = new int[2];
        rootArray[0] = root.val + left[1] + right[1];
        rootArray[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return rootArray;
    }
}
