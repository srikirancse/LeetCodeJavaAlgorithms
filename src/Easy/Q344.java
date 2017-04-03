package Easy;

/**
 * Created by Srikiran Sistla on 3/20/2017.
 */
public class Q344 {
    public String reverseString(String s) {
        char[] str = s.toCharArray();
        if(s.length()== 1 || s.length() == 0) return s;
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            char temp = s.charAt(i);
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return new String(str);
    }
}
