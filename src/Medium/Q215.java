package Medium;

/**
 * Created by Srikiran Sistla on 3/5/2017.
 */
public class Q215 {
    public int findKthLargest(int[] a, int k) {
        int arrayLen = a.length;
        return a[quickSelect(a, 0, arrayLen-1, arrayLen-k+1)];
    }

    private int quickSelect(int[] a, int lo, int hi, int k) {
        int i = lo, j = hi, pivot = a[hi];
        while (i<j) if (a[i++] > pivot) swap(a, --i, --j);
        swap(a, i, hi);
        int m = i - lo + 1;
        if (m==k) return i;
        else if (m>k) return quickSelect(a, lo, i-1, k);
        else return quickSelect(a, i+1, hi, k-m);
    }

    private void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
}
