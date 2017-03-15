package Easy;

/**
 * Created by Srikiran Sistla on 10/7/2016.
 */
public class Q67 {
    public static void main(String[] args) {
        String a = "101000001";
        String b = "11010100";
        System.out.println(a.charAt(1)-'0');
        System.out.println(b.charAt(1));
        System.out.println(a.charAt(1)-'1'+b.charAt(1)-'0');
    }
}

