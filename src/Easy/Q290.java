package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Srikiran Sistla on 1/3/2017.
 */
public class Q290 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length){
            System.out.println("Pattern Length: "+pattern.length()+",Word length: "+words.length);
            return false;
        }
        Map hash = new HashMap();
        for (int i = 0; i < words.length; i++) {
            if (hash.put(str.charAt(i),i)!=hash.put(words[i],i)){
                System.out.println(i);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Q290 obj = new Q290();
        System.out.println(obj.wordPattern("abba", "dog cat cat dog"));
    }
}
