package Medium;

import Easy.Q2;

/**
 * Created by Srikiran Sistla on 3/26/2017.
 */
public class Q287 {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }

    public static void main(String[] args) {
        Q287 q287 = new Q287();
        System.out.println(q287.findDuplicate(new int[] {5,1,2,3,5,4}));
    }
}
