package Easy;

import java.util.stream.Stream;

/**
 * Created by Srikiran Sistla on 5/24/2017.
 * Reverse Words in a String III
 */
public class Q557 {
    public String reverseWords(String s) {
        String[] ans = Stream.of(s.split(" ")).map(w -> new StringBuilder(w).reverse().toString()).toArray(String[]::new);
        return String.join("\\s", ans);
    }
}
