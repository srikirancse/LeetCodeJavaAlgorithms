package Medium;

/**
 * Created by Srikiran Sistla on 3/2/2017.
 */
public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        int lastIndices[] = new int[256];
        for (int i = 0; i < 256; i++){
            lastIndices[i] = -1;
        }
        int start = 0;
        int curLen = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            //case 1: index is -1
            //case 2: index is some value less than start point which means this character is not yet repeated in
            //          current substring
            //case 3: index is some value more than start point which means this character has repeated
            if (lastIndices[cur] < start){
                lastIndices[cur] = i;
                curLen++;
            }
            else {
                start = lastIndices[cur]+1;
                curLen = i - start + 1;
                lastIndices[cur] = i;
            }
            if (curLen > maxLen){
                maxLen = curLen;
            }
        }
        return maxLen;
    }
}
