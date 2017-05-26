package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 5/20/2017.
 * Restore IP Address
 */

public class Q93 {
    public List<String> restoreIpAddresses(String s) {

        int len = s.length();
        List<String> res = new ArrayList<>();

        if (len < 4) return res;

        for (int i = 1; i < 4 && i < len -2; i++) {
            for (int j = i+1; j < i+4 && j < len -1; j++) {
                for (int k = j+1; k < j+4 && k < len; k++) {

                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k, len);

                    if (isValid(a) && isValid(b) && isValid(c) && isValid(d)) res.add(a + "." + b + "." + c + "." + d);
                }

            }
        }

        return res;
    }

    private boolean isValid(String a) {
        return !(a.length() > 3 || a.length() == 0 || (a.charAt(0) == '0' && a.length() > 1) || Integer.valueOf(a) > 255);
    }


    public static void main(String[] args) {
        Q93 q93 = new Q93();
        q93.restoreIpAddresses("25525511135");
    }
}
