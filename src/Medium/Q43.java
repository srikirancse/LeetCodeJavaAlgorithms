package Medium;

/**
 * Created by Srikiran Sistla on 4/13/2017.
 */
public class Q43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length(), n = num2.length();
        int[] res = new int[m+n];
        for (int i = m-1; i >= 0; i--){
            for (int j = n-1; j >= 0; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i+j, p2 = i+j+1;
                int sum = mul + res[p2];
                res[p1] += sum/10;
                res[p2] = (sum)%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int re : res) {
            if (flag) sb.append(re);
            else if(re!= 0) {
                sb.append(re);
                flag = true;
            }
        }
        return sb.toString();
    }
}
