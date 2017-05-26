package Medium;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Srikiran Sistla on 5/8/2017.
 * Number of swaps
 */
public class VMWareQ1 {


    public int noOfSwapsToSort(int[] A){

        Integer[] B = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        int swaps = 0;
        Arrays.sort(B, Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) swaps++;
        }
        return swaps-1;
    }

    public static void main(String[] args) {
        VMWareQ1 vmWareQ1 = new VMWareQ1();
        System.out.println(vmWareQ1.noOfSwapsToSort(new int[]{3,1,2,4}));
    }


}
