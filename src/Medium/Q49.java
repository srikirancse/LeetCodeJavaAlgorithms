package Medium;

import java.util.*;

/**
 * Created by Srikiran Sistla on 4/3/2017.
 */
public class Q49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Arrays.sort(strs);
        Map<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sSorted = String.valueOf(c);
            if (!hm.containsKey(sSorted)) hm.put(sSorted, new ArrayList<String>());
            hm.get(sSorted).add(s);
        }
        return new ArrayList<List<String>>(hm.values());
    }
}
