package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Srikiran Sistla on 1/4/2017.
 */
public class Q205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        int a[] = new int[512];
        for (int i = 0; i < s.length(); i++){
            if (a[s.charAt(i)] != a[t.charAt(i)+256]) return false;
            a[s.charAt(i)] = a[t.charAt(i)+256] = i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        Q205 obj = new Q205();
        System.out.println(obj.isIsomorphic("a", "a"));
    }
}
