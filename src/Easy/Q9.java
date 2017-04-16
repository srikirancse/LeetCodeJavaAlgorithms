package Easy;

/**
 * Created by Srikiran Sistla on 4/15/2017.
 * Palindromic integer
 */
public class Q9 {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        if (x/10 == 0 && x!=10) return true;
        int a = x, b = 0;
        while (a!=0){
            a /= 10;
            b++;
        }
        b = (int) Math.pow(10,b-1);
        int c = x;
        while (x!=0){
            if (x%10 != c/b) return false;
            x = x/10;
            c -= (c/b)*b;
            b = b/10;
        }
        return true;
    }

    public static void main(String[] args) {
        Q9 q9 = new Q9();
        System.out.println(q9.isPalindrome(213));
    }
}
