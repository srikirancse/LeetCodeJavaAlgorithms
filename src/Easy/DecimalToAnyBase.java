package Easy;

/**
 * Created by Srikiran Sistla on 4/12/2017.
 * Decimal to any base upto 32 simplified
 */
public class DecimalToAnyBase {
    private static char symbolSet[] = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
            'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public String convert(int V, int R) {
        return helper(V, R, "");
    }

    private String helper(int number, int radix, String s) {
        if (number < radix) return symbolSet[number % radix] + s;
        else return helper(number / radix, radix, symbolSet[number % radix] + s);
    }

    public static void main(String[] args) {
        DecimalToAnyBase decimalToAnyBase = new DecimalToAnyBase();
        System.out.println(decimalToAnyBase.convert(0, 36));
    }
}
