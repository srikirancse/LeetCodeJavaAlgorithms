package Easy;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Srikiran Sistla on 12/27/2016.
 */
public class Q384 {
    private int[] nums = null;
    private Random random = null;
    public Q384(int[] nums){
        this.nums = nums;
        random = new Random(System.currentTimeMillis());
    }

    public int[] reset(){
        return Arrays.copyOf(nums,nums.length);
    }

    public int[] shuffle(){
        int[] ans = Arrays.copyOf(nums,nums.length);
        for (int i = 1; i < nums.length; i++){
            int swapIndex = random.nextInt(i+1);
            swap(ans, i, swapIndex);
        }
        return ans;
    }

    private void swap(int[] ans, int i, int swapIndex) {
        int temp = ans[i];
        ans[i] = ans[swapIndex];
        ans[swapIndex] = temp;

    }
}
