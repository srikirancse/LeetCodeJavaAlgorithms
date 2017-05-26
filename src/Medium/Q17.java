package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 5/19/2017.
 * Phone number combinations
 */
public class Q17 {
    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<String>();

        if (digits.length() == 0) return res;

        String[] keyboard = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        helper(digits, keyboard, res, "", 0);

        return res;
    }

    private void helper(String digits, String[] keyboard, List<String> res, String s, int i) {
        if (s.length() == digits.length()){
            res.add(s);
            return;
        }

        int digit = Character.getNumericValue(digits.charAt(i));
        String key = keyboard[digit];

        for (int j = 0; j < key.length(); j++) {
            helper(digits, keyboard, res, s+key.charAt(j), i+1);
        }
    }

    public static void main(String[] args) {
        Q17 q17 = new Q17();
        System.out.println(Arrays.toString(q17.letterCombinations("23").toArray()));
    }
}
