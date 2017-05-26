package Easy;

import java.util.Arrays;

/**
 * Created by Srikiran Sistla on 3/20/2017.
 * Reverse a string
 */
public class Q344 {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = c.length-1;
        while (i<j){
            swap(c, i++, j--);
        }
        return new String(c);
    }

    private void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
