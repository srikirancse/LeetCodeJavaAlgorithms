package Medium;

/**
 * Created by Srikiran Sistla on 3/25/2017.
 */
public class Q11 {
    public int maxArea(int[] height) {
        int j = height.length-1, i = 0, mx = 0;
        while (i<j){
            mx = Math.max(mx, (j-i)*(Math.min(height[j], height[i])));
            if (height[i] < height[j]) i++;
            else j--;
        }
        return mx;
    }

    public static void main(String[] args) {
        Q11 q11 = new Q11();
        System.out.println(q11.maxArea(new int[] {1,2,3,4}));
    }
}
