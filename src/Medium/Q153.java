package Medium;

/**
 * Created by Srikiran Sistla on 5/1/2017.
 * Min element of a rotated array
 */
public class Q153 {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        int len = nums.length;
        if (nums[0] < nums[len - 1]) return nums[0];
        return helper(nums, 0, nums.length - 1);
    }

    private int helper(int[] nums, int lo, int hi) {
        if (nums[lo] < nums[hi]) return nums[lo];
        if (lo == hi) return nums[lo];
        if (lo - hi == 1) return Math.min(nums[lo], nums[hi]);
        int mid = (lo + hi) / 2;
        if (nums[lo] > nums[mid]) return helper(nums, lo, mid);
        else return helper(nums, mid + 1, hi);
    }
}
