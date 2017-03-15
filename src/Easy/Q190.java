package Easy;

/**
 * Created by Srikiran Sistla on 10/18/2016.
 */
public class Q190 {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++){
            result += n&1;
            n>>>=1;
            if (i<31) result <<= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int m = 0;
        System.out.println(Integer.toBinaryString(0));
    }
}
