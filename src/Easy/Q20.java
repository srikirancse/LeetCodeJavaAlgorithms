package Easy;

/**
 * Created by Srikiran Sistla on 3/7/2017.
 */
public class Q20 {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int head = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack[head++] = c;
                    break;
                case '}':
                    if (head == 0 || stack[--head] != '{') return false;
                    break;
                case ']':
                    if (head == 0 || stack[--head] != '[') return false;
                    break;
                case ')':
                    if (head == 0 || stack[--head] != '(') return false;
                    break;
            }
        }
        return head == 0;
    }

    public static void main(String[] args) {
        System.out.println((int) '[');
    }
}
