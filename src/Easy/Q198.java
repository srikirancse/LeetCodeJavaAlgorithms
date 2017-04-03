package Easy;

/**
 * Created by Srikiran Sistla on 4/2/2017.
 */
public class Q198 {
    public int rob(int[] nums) {
        int rob = 0; // max money if robbed current house
        int notRob = 0; // maximum money if not robbed the current house
        for (int currentRob : nums) {
            int expRob = notRob + currentRob;
            notRob = Math.max(rob, notRob); // If the current house is not robbed, take the max value of previous rob and notRob values
            rob = expRob; // if the current house is robbed the previous house should not be robbed
        }
        return Math.max(rob, notRob);
    }
}
