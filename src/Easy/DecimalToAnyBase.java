package Easy;

/**
 * Created by Srikiran Sistla on 4/12/2017.
 * Decimal to any base upto 32 simplified
 */
public class DecimalToAnyBase {
    private static char symbolSet[] = new char[] { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T' };

    public String convert ( int V, int R )
    {
        return helper(V, R, "");
    }

    private String helper(int number, int base, String s) {
        return number < base ? symbolSet[number % base] + s : helper(number / base, base, symbolSet[number % base] + s);
    }

    public static void main(String[] args) {
        DecimalToAnyBase decimalToAnyBase = new DecimalToAnyBase();
        System.out.println(decimalToAnyBase.convert(17,7));
    }
}
