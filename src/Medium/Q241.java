package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Srikiran Sistla on 5/1/2017.
 * Different ways to add parenthesis
 */
public class Q241 {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<Integer>();

        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '+' || c == '-' || c == '*') {
                String s1 = input.substring(0, i);
                String s2 = input.substring(i + 1);

                List<Integer> l1 = diffWaysToCompute(s1);
                List<Integer> l2 = diffWaysToCompute(s2);

                for (Integer n1 : l1) {
                    for (Integer n2 : l2) {
                        switch (c) {
                            case '+': res.add(n1 + n2); break;
                            case '-': res.add(n1 - n2); break;
                            case '*': res.add(n1 * n2); break;
                        }
                    }
                }
            }
        }

        if (res.size() == 0) {
            res.add(Integer.valueOf(input));
        }

        return res;
    }

    public static void main(String[] args) {
        Q241 q241 = new Q241();
        System.out.println(Arrays.toString((q241.diffWaysToCompute("2*3-4*5")).toArray()));
    }
}
