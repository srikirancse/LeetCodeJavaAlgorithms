package Easy;

/**
 * Created by Srikiran Sistla on 3/19/2017.
 */
public class Q204 {
    public int countPrimes(int n) {
        if (n < 3) return 0;
        int count = n/2;
        boolean[] isPrime = new boolean[n];
        for (int i = 3; i*i < n ; i+=2){
            if (isPrime[i]) continue;
            for (int j = i*i; j < n; j+=2*i){
                if (!isPrime[i]){
                    count--;
                    isPrime[i] = true;
                }
            }
        }
        return count;
    }
}
