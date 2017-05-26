package Medium;

import Easy.Q9;

/**
 * Created by Srikiran Sistla on 5/16/2017.
 *  Number Decoding
 */
public class Q91 {
    public int numDecodings(String s) {

        if (s == null || s.length() == 0 || s.charAt(0) == '0') return 0;

        int len = s.length();
        int[] dp = new int[len+1];
        dp[0] = 1; dp[1] = 1;

        for (int i = 2; i <= len; i++) {
            int count = 0;
            if (s.charAt(i-1) > '0') count = dp[i-1];
            if (s.charAt(i-2) == '1' || (s.charAt(i-2) =='2' && s.charAt(i-1) <= '6')) count += dp[i-2];
            dp[i] = count;
        }

        return dp[len];

//        int res = 1;
//
//        for (int i = 2; i <= len; i++) {
//            if (s.charAt(i-1) > '0'){
//                if (s.charAt(i-2) == '1' || (s.charAt(i-2) =='2' && s.charAt(i-1) <= '6')) res++;
//            }
//        }
//        return res;
    }

    public static void main(String[] args) {
        Q91 q91 = new Q91();
        System.out.println(q91.numDecodings("1010"));
    }
}
