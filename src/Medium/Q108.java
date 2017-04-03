package Medium;

/**
 * Created by Srikiran Sistla on 3/21/2017.
 */
public class Q108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        TreeNode res = helper(nums, 0, nums.length-1);
        return res;
    }

    private TreeNode helper(int[] nums, int lo, int hi) {
        if (lo <= hi){
            int mid = (lo+hi)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = helper(nums, lo, mid-1);
            root.right = helper(nums, mid+1, hi);
            return root;
        }
        return null;
    }
}
