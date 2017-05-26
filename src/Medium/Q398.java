package Medium;

import java.util.Random;

/**
 * Created by Srikiran Sistla on 5/10/2017.
 * Random Pick Index
 */
public class Q398 {
    Random random;
    int[] nums;
    public Q398(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    public int pick(int target) {
        int count = 0, res = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target)
                continue;
            if (random.nextInt(++count) == 0) res = i;
        }
        return res;
    }
}
