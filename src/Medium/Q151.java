package Medium;

import java.util.Arrays;

/**
 * Created by Srikiran Sistla on 4/16/2017.
 * Reverse the words
 */
public class Q151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        System.out.println(Arrays.toString(words));
        for (int i = words.length-1; i >0; i--){
            if (!words[i].equals(" "))
                sb.append(words[i]).append(" ");
        }
        return sb.append(words[0]).toString();
    }

    public static void main(String[] args) {
        Q151 q151 = new Q151();
        System.out.println(q151.reverseWords(" a  b"));
    }
}
