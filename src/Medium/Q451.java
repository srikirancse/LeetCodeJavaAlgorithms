package Medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by Srikiran Sistla on 3/17/2017.
 */
public class Q451 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) +1);
            else map.put(c,1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                        return b.getValue() - a.getValue();
                    }
                }
        );
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()){
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int) e.getValue(); i++){
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
}
