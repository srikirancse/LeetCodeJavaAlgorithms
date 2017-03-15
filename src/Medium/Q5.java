package Medium;

/**
 * Created by Srikiran Sistla on 3/12/2017.
 */
public class Q5 {
    public String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        int start = 0, end = 0, max = 0;
        for (int i = 0; i < str.length; i++) {
            if (isPalindrome(str, i - max - 1, i)) {
                start = i - max - 1;
                end = i;
                max += 2;
            } else if (isPalindrome(str, i - max, i)) {
                start = i - max;
                end = i;
                max += 1;
            }
        }
        return s.substring(start, end + 1);
    }

    private boolean isPalindrome(char[] str, int i, int j) {
        if (i < 0) return false;
        while (i < j) if (str[i++] != str[j--]) return false;
        return true;
    }
}
