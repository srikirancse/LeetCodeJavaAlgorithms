package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 2/19/2017.
 */
public class Q131 {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), s, 0);
        return list;
    }

    private void backtrack(List<List<String>> list, ArrayList<String> tempList, String s, int start) {
        if (start == s.length()) {
            list.add(new ArrayList<>(tempList));
        }
        for (int i = start; i < s.length(); i++){
            if (isPalindrome(s, start, i)) {
                tempList.add(s.substring(start, i+1));
                backtrack(list, tempList, s, i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high) {
        while (high > low)
            if (s.charAt(low++)!=s.charAt(high--)) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("abcdefg".substring(0,3));
    }
}
