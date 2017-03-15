package Medium;

/**
 * Created by Srikiran Sistla on 3/6/2017.
 */
public class Q50 {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            if (n == Integer.MIN_VALUE) n = Integer.MAX_VALUE+1;
            else {
                n = -n;
                x = 1 / x;
            }

        }

        if (n % 2 == 0) return myPow(x * x, n / 2);
        else return x * myPow(x * x, n / 2);
    }

    public static void main(String[] args) {
        Q50 q50 = new Q50();
        System.out.println(q50.myPow(2.00000, -2147483648));
        long n = -2147483648;
        n = -1 * n;
        System.out.println(Integer.MIN_VALUE);
    }
}