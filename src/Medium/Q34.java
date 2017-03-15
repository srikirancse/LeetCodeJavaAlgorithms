package Medium;

/**
 * Created by Srikiran Sistla on 3/6/2017.
 */
public class Q34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        return helper(nums, 0, nums.length - 1, target);
    }

    private int[] helper(int[] nums, int lo, int hi, int target) {
        int mid = lo + ((hi - lo) / 2);
        if (lo > hi) return new int[]{-1, -1};
        if (lo == hi) return nums[lo] == target ? new int[]{lo, lo} : new int[]{-1, -1};
        else if (nums[mid] == target) {
            int lowerBound, upperBound;
            lowerBound = upperBound = mid;
            while (lowerBound >= 0) {
                if (nums[lowerBound] != target) break;
                lowerBound--;
            }
            while (upperBound < nums.length) {
                if (nums[upperBound] != target) break;
                upperBound++;
            }
            return new int[]{lowerBound + 1, upperBound - 1};
        } else if (nums[mid] > target) return helper(nums, lo, mid - 1, target);
        else return helper(nums, mid + 1, hi, target);
    }
}
