package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Srikiran Sistla on 1/14/2017.
 */
public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            if(res.containsKey(target-nums[i])){
                result[0] = res.get(target-nums[i]);
                result[1] = i+1;
                return result;
            }else{
                res.put(nums[i], i+1);
            }
        }
        return result;
    }
}
