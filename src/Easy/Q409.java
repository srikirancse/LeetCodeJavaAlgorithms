package Easy;

/**
 * Created by Srikiran Sistla on 3/3/2017.
 */
public class Q409 {
    public int longestPalindrome(String s) {
        int maxLen = 0;
        boolean oddExists = false;
        int charCount[] = new int[256];
        for (int i = 0; i < s.length(); i++) charCount[s.charAt(i)]++;
        for (int aCharCount : charCount)
            if ((aCharCount & 1) == 0) maxLen += aCharCount;
            else{
                if (!oddExists){
                    maxLen++;
                    oddExists = true;
                }
                maxLen += (aCharCount - 1);
            }
        return maxLen;
    }
}


