package Medium;

import java.util.Stack;

/**
 * Created by Srikiran Sistla on 2/23/2017.
 */
public class Q150 {
    public int evalRPN(String[] a) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.length; i++){
            switch (a[i]){
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop()+stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    int a1 = stack.pop();
                    int b = stack.pop();
                    stack.push(b/a1);
                    break;

                default:
                    stack.push(Integer.parseInt(a[i]));
            }
        }
        return stack.pop();
    }
}
