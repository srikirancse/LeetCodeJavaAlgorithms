package Easy;

import java.util.HashSet;

/**
 * Created by Srikiran Sistla on 3/31/2017.
 */
public class Q217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0){
            return false;
        }
        HashSet<Integer> hs = new HashSet<>();
        int i=0;
        while (hs.add(nums[i]) && i<nums.length){
            i++;
        }
        return i != nums.length;
    }
}
