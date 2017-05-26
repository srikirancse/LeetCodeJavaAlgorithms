package Easy;

/**
 * Created by Srikiran Sistla on 5/24/2017.
 * Longest Uncommon sub sequence
 */
public class Q521 {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
