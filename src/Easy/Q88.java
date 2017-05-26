package Easy;

/**
 * Created by Srikiran Sistla on 4/26/2017.
 */
public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m+n - 1;
        if (n == 0) return;
        while (k >= 0 && j >= 0) {
            if (i<0) nums1[k--] = nums2[j--];
            else if (nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
    }
}
