package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 1/10/2017.
 */
public class Q118At2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }

    public static void main(String[] args) {
        Q118At2 obj = new Q118At2();
        List<List<Integer>> res = obj.generate(6);
        System.out.println(res);
    }
}
