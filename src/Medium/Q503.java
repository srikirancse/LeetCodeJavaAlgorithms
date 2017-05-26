package Medium;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Srikiran Sistla on 5/26/2017.
 * Next Greater Element II
 */
public class Q503 {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] next = new int[n];
        Arrays.fill(next, -1);

        for (int i = 0; i < n*2; i++){
            int num = nums[i%n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) next[stack.pop()] = num;
            if (i < n) stack.push(i);
        }

        return next;
    }
}
