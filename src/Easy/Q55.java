package Easy;

/**
 * Created by Srikiran Sistla on 5/11/2017.
 * Jump game
 */
public class Q55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        if (nums.length == 2 && (nums[0] == 2 && nums[1] == 0)) return true;
        int i = 0;
        while (i < nums.length){
            if (nums[i] == 0) return false;
            i += nums[i];
            if (i == nums.length-1) return true;
        }
        return false;
    }
}
