package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Srikiran Sistla on 5/26/2017.
 * Next Greater Element I
 */
public class Q496 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums){
            while (!stack.isEmpty() && stack.peek() < num) map.put(stack.pop(), num);
            stack.push(num);
        }

        for (int i = 0; i < findNums.length; i++) {
            findNums[i] = map.getOrDefault(map.get(findNums[i]), -1);
        }

        return findNums;
    }
}
