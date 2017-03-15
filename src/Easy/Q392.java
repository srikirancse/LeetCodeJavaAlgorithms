package Easy;

/**
 * Created by Srikiran Sistla on 12/28/2016.
 */
public class Q392 {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0) return true;
        int sLength = 0, tLength = 0;
        while (tLength < t.length()){
            if(s.charAt(sLength) == t.charAt(tLength)){
                sLength++;
                if (sLength==s.length()) return true;
            }
            tLength++;
        }
        return false;
    }
}
