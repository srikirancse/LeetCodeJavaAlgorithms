package Easy;

/**
 * Created by Srikiran Sistla on 4/2/2017.
 */
public class Q242 {
    public boolean isAnagram(String s, String t) {
        int[] res = new int[128];
        for (char c: s.toCharArray()) res[c]++;
        for (char c: t.toCharArray()) res[c]--;
        if (s.length()>=t.length()){
            for (char c: s.toCharArray())
                if (res[c] != 0) return false;
        }
        else{
            for (char a: t.toCharArray())
                if (res[a] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Q242 q242 = new Q242();
        System.out.println(q242.isAnagram("a", "ab"));
    }
}
