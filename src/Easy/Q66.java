package Easy;

import java.util.Arrays;

/**
 * Created by Srikiran Sistla on 4/15/2017.
 */
public class Q66 {
    public int[] plusOne(int[] digits) {
        int carry =0, counter = digits.length-1;
        do{
            int replace = ++digits[counter];
            carry = replace/10;
            digits[counter] = replace%10;
            counter--;
        } while (carry !=0 && counter >= 0);
        if (carry != 0){
            int[] res = new int[digits.length+1];
            res[0] = carry;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        }
        return digits;
    }

    public static void main(String[] args) {
        Q66 q66 = new Q66();
        System.out.println(Arrays.toString(q66.plusOne(new int[] {0})));
    }
}
