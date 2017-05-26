package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Srikiran Sistla on 4/27/2017.
 * Summary Ranges
 */
public class Q228 {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        int startIndex = 0, endIndex = 0, len = nums.length;
        if (len == 1){
            ans.add(nums[0]+"");
            return ans;
        }
        for (int i = 1; i <= len; i++) {
            if (i == len || (long)nums[i] - (long)nums[i-1] > 1){   //long to avoid numeric overflow edge case
                if (startIndex == endIndex) ans.add(nums[startIndex]+"");
                else ans.add(nums[startIndex] + "->" + nums[endIndex]);
                startIndex = i;
                endIndex = i;
            }
            else endIndex = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Q228 q228 = new Q228();
        System.out.println("sfasdf "+(-2147483647-2147483647));
        System.out.println(Arrays.toString(q228.summaryRanges(new int[] {-2147483648,-2147483647,2147483647}).toArray()));
        System.out.println(Arrays.toString(q228.summaryRanges(new int[] {-2,-1,2}).toArray()));
    }
}
