package Medium;

/**
 * Created by Srikiran Sistla on 12/30/2016.
 */
/*
Algorithm 1:
Example array input: a [2, 3, 1, 1, 4] o/p: true
1. Iterate through the array and keep track of a[i]+i
    Working:
    1. Pointer reaches a[0] and adds the value to 2+0 = 2 and now the array jumps to a[2]
    2. Pointer reaches a[2] and adds the value to 1+2 = 3 and now the array jumps to a[3]
    3. Pointer reaches a[3] and adds the value to 1+3 = 4 and now the array jumps to a[4]

2. Once it reaches the last index true is returned by canJump and if a[i]+i value exceeds a.length
 false is returned

 Algorithm 2:
 Example array input: a [2, 3, 1, 1, 4] o/p: true
 1. 

 */
public class Q55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1 && nums[0] == 0) return true;
        int jumpIndex = 0;
        int i = 0;
        while (i <= nums.length-1){
            i += nums[i];
            if (i == nums.length-1) return true;
        }
        return false;
    }
}
