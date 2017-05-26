package Easy;

/**
 * Created by Srikiran Sistla on 5/9/2017.
 * Add strings
 */
public class Q415 {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int carry = 0, a = num1.length() - 1, b = num2.length() - 1;
        while (a >= 0 || b >= 0) {
            int sum = (a >= 0 ? Character.getNumericValue(num1.charAt(a--)) : 0) + (b >= 0 ? Character.getNumericValue(num2.charAt(b--)) : 0) + carry;
            if (sum > 9) {
                carry = 1;
                sum %= 10;
            } else carry = 0;
            res.insert(0, sum);
        }
        if (carry > 0) res.insert(0, carry);
        return String.valueOf(res);
    }
}
