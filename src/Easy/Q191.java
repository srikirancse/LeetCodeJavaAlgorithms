package Easy;

/**
 * Created by Srikiran Sistla on 3/8/2017.
 */
public class Q191 {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++){
            if ((n&1) == 1) count++;
            n>>>=1;
        }
        return count;
    }
}
