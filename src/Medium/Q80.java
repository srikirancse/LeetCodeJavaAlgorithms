package Medium;

/**
 * Created by Srikiran Sistla on 3/3/2017.
 */
public class Q80 {
    public int removeDuplicates(int[] nums) {
        int i = nums.length == 0 ? 0 : 1;
        int count = 1;
        for (int i1 = 1; i1 < nums.length; i1++) {
            int n = nums[i1];
            if (n > nums[i - 1]) {
                if (count == 0) count++;
                nums[i++] = n;
            }
            else if (n == nums[i - 1] && count == 1){
                nums[i++] = n;
                count = 0;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Q80 q80 = new Q80();
        int i = q80.removeDuplicates(new int[] {1,1});
        System.out.println(i);
    }
}
