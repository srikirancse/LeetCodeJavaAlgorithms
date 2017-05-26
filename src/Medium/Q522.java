package Medium;

/**
 * Created by Srikiran Sistla on 5/24/2017.
 * Longest Uncommon Sub-sequence II
 */
public class Q522 {
    public int findLUSlength(String[] strs) {
        int max = strs[0].length();
        boolean flag = false;
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].equals(strs[i-1])) flag = true;
            max = Math.max(max, strs[i].length());
        }
        return flag? max : -1;
    }

    private boolean isSubsequence(String s1, String s2){
        int idx = 0;
        return false;
    }

    public static void main(String[] args) {
        Q522 q522 = new Q522();
        System.out.println(q522.findLUSlength(new String[] {"aaa","aaa","aa"}));
    }
}
