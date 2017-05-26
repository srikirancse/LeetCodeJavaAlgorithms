package Medium;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Srikiran Sistla on 5/23/2017.
 * Complex Number Multiplication
 */
public class Q537 {
    public String complexNumberMultiply(String a, String b) {

        int[] a1 = Stream.of(a.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
        int[] b1 = Stream.of(b.split("\\+|i")).mapToInt(Integer::parseInt).toArray();

        return (a1[0] * b1[0] - a1[1] * b1[1]) + "+" + (a1[0] * b1[1] + a1[1] * b1[0]) + "i";
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString("3+2i".split("\\+|i")));
    }
}
