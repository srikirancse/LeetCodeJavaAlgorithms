package Easy;

import java.util.*;

/**
 * Created by Srikiran Sistla on 5/11/2017.
 */
public class HeavyWaterBalance {
    int[] balanedOrNot(String[] expressions, int[] maxReplacements){
        int[] res = new int[Integer.valueOf(expressions[0])];
        for (int i = 1; i < expressions.length; i++) {
            Stack<Character> stack = new Stack<>();
            String exp = expressions[i];
            for (int j = 0; j < exp.length(); j++) {
                switch (exp.charAt(j)){
                    case '<':
                        stack.push('<');
                        break;
                    case '>':
                        if (stack.isEmpty() || stack.peek() == '>') stack.push('>');
                        else stack.pop();
                        break;
                }
            }
            if (stack.size() <= maxReplacements[i]) res[i-1] = 1;
            else res[i-1] = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        HeavyWaterBalance heavyWaterBalance = new HeavyWaterBalance();
        System.out.println(Arrays.toString(heavyWaterBalance.balanedOrNot(new String[] {"1", "<<<><><>"}, new int[]{1,2} )));
    }
}
