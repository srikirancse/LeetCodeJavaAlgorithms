package Medium;

import java.util.Arrays;

/**
 * Created by Srikiran Sistla on 5/17/2017.
 * Compare version numbers
 */
public class Q165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int v1Len = v1.length;
        int v2Len = v2.length;
        int i = 0;
        for (; i < Math.min(v1Len, v2Len); i++){
            if (Integer.valueOf(v1[i]).equals(Integer.valueOf(v2[i]))) continue;
            else if (Integer.valueOf(v1[i]) > Integer.valueOf(v2[i])) return 1;
            else return -1;
        }
        if (v1Len > v2Len){
            while (i < v1Len){
                if (!Integer.valueOf(v1[i]).equals(0)) return 1;
                i++;
            }
            return 0;
        }
        else {
            while (i < v2Len){
                if (!Integer.valueOf(v2[i]).equals(0)) return -1;
                i++;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Q165 q165 = new Q165();
        q165.compareVersion("1", "1.1");
    }
}
