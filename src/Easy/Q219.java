package Easy;

import java.util.*;

/**
 * Created by Srikiran Sistla on 5/24/2017.
 * Contains duplicate 2
 */
public class Q219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (i < k) set.remove(nums[i]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Q219 q219 = new Q219();
        q219.containsNearbyDuplicate(new int[] {99,99}, 2);
    }
}
