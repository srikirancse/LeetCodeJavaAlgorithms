package Medium;

import java.util.Scanner;

/**
 * Created by Srikiran Sistla on 4/21/2017.
 * Balanced Smilies
 */
public class HoneyWellQ2 {
    public static void main(String[] args) {
        System.out.println(isValid("("));

    }

    private static boolean isValid(String msg) {
        int minOpen = 0, maxOpen = 0;
        for (int i = 0; i < msg.length(); i++) {
            char crr = msg.charAt(i);
            if (crr == '(') {
                maxOpen++;
                if (i == 0 || msg.charAt(i - 1) != ':') {
                    minOpen++;
                }
            } else if (crr == ')') {
                minOpen = Math.max(0, minOpen - 1);
                if (i == 0 || msg.charAt(i - 1) != ':') {
                    maxOpen--;
                    if (maxOpen < 0) break;
                }
            }
        }
        return maxOpen >= 0 && minOpen == 0;
    }
}
