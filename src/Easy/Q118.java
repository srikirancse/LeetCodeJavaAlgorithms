package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 1/10/2017.
 */
public class Q118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return null;
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i+1; j++){
                if(i==0 || i == j){
                    row.add(1);
                } else{
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {

    }
}
