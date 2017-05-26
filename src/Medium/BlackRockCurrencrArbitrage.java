package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Srikiran Sistla on 5/4/2017.
 * Currency Arbitrage
 */
public class BlackRockCurrencrArbitrage {
    public int[] arbitrage(String[] quotes){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Integer.valueOf(quotes[0]); i++) {
            double res = 1000000;
            List<String> values = new ArrayList<>();
            values.addAll(Arrays.asList(quotes[i].split(" ")));
            for (String value : values){
                res /= Integer.valueOf(value);
            }
            list.add(res - 1000000 > 0 ? (int) res : 0);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size()-1; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
