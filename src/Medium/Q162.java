package Medium;

/**
 * Created by Srikiran Sistla on 4/15/2017.
 */
public class Q162 {
    public int findPeakElement(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    private int helper(int[] nums, int lo, int hi) {
        if (lo == hi) return lo;
        int mid1 = (lo+hi)/2;
        int mid2 = mid1+1;
        if (nums[mid1] > nums[mid2]) return helper(nums, lo, mid1);
        else return helper(nums, mid2, hi);
    }
}
