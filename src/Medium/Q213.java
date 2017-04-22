package Medium;

/**
 * Created by Srikiran Sistla on 4/17/2017.
 */
public class Q213 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(helper(nums, 0, nums.length-1), helper(nums, 1, nums.length));
    }

    private int helper(int[] nums, int lo, int hi) {
        int include = 0, exclude = 0;
        for (int i = lo; i < hi; i++) {
            int expVal = exclude + nums[i];
            exclude = Math.max(include, exclude);
            include = expVal;
        }
        return Math.max(include, exclude);
    }
}
