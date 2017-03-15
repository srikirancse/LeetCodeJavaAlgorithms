package Medium;

/**
 * Created by Srikiran Sistla on 3/10/2017.
 */
public class Q31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        for ( ; i>=0; i--) if (nums[i] < nums[i + 1]) break;
        int j = nums.length-1;
        if (i>=0){
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }

    private void reverse(int[] nums, int i, int length) {
        while (i<length) swap(nums, i++, length--);
    }

    private void swap(int[] nums, int i, int i1) {
        int temp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = temp;
    }
}
