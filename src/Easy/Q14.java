package Easy;

/**
 * Created by Srikiran Sistla on 5/10/2017.
 * LCP
 */
public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String ans = "";
        int min = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s.length() < min) {
                ans = s;
                min = s.length();
            }
        }
        for (String s : strs) {
            if (!s.substring(0, ans.length()).equals(ans)) {
                int i;
                for (i = 0; i < ans.length() && s.charAt(i) == ans.charAt(i); i++);
                if (i == 0) return "";
                else ans = ans.substring(0, i);
            }
        }
        return ans;
    }
}
