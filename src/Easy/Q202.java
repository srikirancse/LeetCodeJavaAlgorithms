package Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Srikiran Sistla on 3/30/2017.
 */
public class Q202 {
    public boolean isHappy(int n) {
        Set<Integer> list = new HashSet<>();
        while (list.add(n)) {
            int squareSum = digitSquareSum(n);
            if (squareSum == 1) return true;
            n = squareSum;
        }
        return false;
    }

    public int digitSquareSum(int n) {
        int i = 0;
        while (n != 0) {
            int j = n % 10;
            n /= 10;
            i += j * j;
        }
        return i;
    }
}
