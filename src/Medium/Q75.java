package Medium;

/**
 * Created by Srikiran Sistla on 4/29/2017.
 */
public class Q75 {
    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length-1;
        for (int i = 0; i < two; i++) {
            while (nums[i] == 2 && i < two) swap(i, two--, nums);
            while (nums[i] == 0 && i > zero) swap(i, zero++, nums);
        }
    }

    private void swap(int a, int b, int[] nums) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}
