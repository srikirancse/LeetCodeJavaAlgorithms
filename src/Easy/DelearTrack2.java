package Easy;

import java.util.*;

/**
 * Created by Srikiran Sistla on 10/21/2016.
 */
public class DelearTrack2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String[] key = input.next().split(",",-1);
            Integer newValue;
            // checks if a proper key and value is supplied or not
            if (key.length == 2 && key[0].length() > 0) {
                try {
                    newValue = Integer.valueOf(key[1]);
                } catch (NumberFormatException nex) {
                    continue;
                }
                if (map.containsKey(key[0])) {
                    Integer oldValue = map.get(key[0]);
                    newValue += oldValue;
                }
                map.put(key[0], newValue);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }

}
