package Easy;

/**
 * Created by Srikiran Sistla on 5/21/2017.
 */
public class Q383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] res = new char[26];
        for (char c : magazine.toCharArray()) res[c - 'a']++;
        for (char c : ransomNote.toCharArray()) {
            if (--res[c - 'a'] < 0) return false;
        }
        return true;
    }
}
