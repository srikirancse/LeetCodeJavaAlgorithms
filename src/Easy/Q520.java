package Easy;

/**
 * Created by Srikiran Sistla on 5/18/2017.
 * Detect Capital
 */
public class Q520 {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|[a-z]*|[A-Z][a-z]*");
    }
}