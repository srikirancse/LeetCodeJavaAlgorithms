package Medium;

import java.util.*;

/**
 * Created by Srikiran Sistla on 5/4/2017.
 * Black Rock Voting
 */
public class BlackRockVoting {
    public String electionWinner(String[] votes){
        int max = Integer.MIN_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (String name : votes){
            map.put(name, map.getOrDefault(name, 0)+1);
            max = Math.max(max, map.get(name));
        }
        for (String key : map.keySet()) {
            if (map.get(key) == max) list.add(key);
        }
        Collections.sort(list);


        return list.get(list.size()-1);
    }
}
