package Easy;

/**
 * Created by Srikiran Sistla on 4/22/2017.
 * Climbing steps
 */
public class Q70 {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Q70 q70 = new Q70();
        System.out.println(q70.climbStairs(4));
    }
}