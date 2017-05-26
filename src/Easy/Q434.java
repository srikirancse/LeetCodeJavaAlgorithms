package Easy;

import java.util.Arrays;

/**
 * Created by Srikiran Sistla on 5/18/2017.
 */
public class Q434 {
    public int countSegments(String s) {
        return s.trim().length() == 0? 0 : s.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString("Hello, my name is John".split("[\\W&&[\\w]\\s]+")));
    }
}
