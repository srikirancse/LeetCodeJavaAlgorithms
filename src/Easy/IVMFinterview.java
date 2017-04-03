package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Srikiran Sistla on 3/26/2017.
 */
public class IVMFinterview {
    static List<Object> myList = new ArrayList<>();
    boolean isThere(Object key){
        return false;
    }

    public static void main(String[] args) {
        myList.addAll(Arrays.asList(args));
        System.out.println(myList.contains(6));
        System.out.println(myList.contains("srikiran"));

    }
}
