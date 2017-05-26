package Easy;

/**
 * Created by Srikiran Sistla on 4/23/2017.
 */
public class GalateaQ1 {
    public int maxDeviation(int[] A) {
        int len = A.length;
        if (len == 0 ) return -1;
        int answer = 0;
        double average = 0, maxDeviation = Double.MIN_VALUE;
        for (int a : A) average += a;
        average /= len;
        for (int i = 0; i < len; i++) {
            if (Math.abs(A[i] - average) > maxDeviation){
                maxDeviation = Math.abs(A[i] - average);
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        GalateaQ1 galateaQ1 = new GalateaQ1();
        System.out.println(galateaQ1.maxDeviation(new int[]{-10, -20, -16, -4}));
    }
}
