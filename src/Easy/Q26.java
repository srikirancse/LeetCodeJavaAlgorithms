package Easy;

/**
 * Created by Srikiran Sistla on 3/3/2017.
 */
public class Q26 {
    public int removeDuplicates(int[] nums) {
        int i = nums.length == 0 ? 0 : 1;
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}
