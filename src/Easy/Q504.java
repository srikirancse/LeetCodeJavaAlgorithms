package Easy;

/**
 * Created by Srikiran Sistla on 2/11/2017.
 */
public class Q504 {
    public String convertTo7(int num) {
        boolean resSign = false;
        if (num<0)
            resSign = true;
        String res = "";
        while (num > 0) {
            res += num % 7;
            num = num / 7;
        }
        if (resSign)
            res+="-";
        return new StringBuilder(res).reverse().toString();
    }

    public static void main(String[] args) {
        Q504 q504 = new Q504();
        System.out.println(q504.convertTo7(100));
    }
}
