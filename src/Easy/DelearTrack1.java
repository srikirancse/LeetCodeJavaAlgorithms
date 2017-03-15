package Easy;

/**
 * Created by Srikiran Sistla on 10/21/2016.
 */
public class DelearTrack1 {
    private static final char[] charMap = new char[256];

    static {
        for (int i = 0; i < 10; i++) {
            charMap[i + '0'] = (char) (1 + i);  // numeric
        }
        for (int i = 0; i < 26; i++) {
            charMap[i + 'a'] = charMap[i + 'A'] = (char) (11 + i);  //alphabetic, ignore cases
        }
    }

    public boolean isPalindrome(String s) {
        char[] pChars = s.toCharArray();
        int start = 0, end = pChars.length - 1;
        char cS, cE;
        while (start < end) {
            cS = charMap[pChars[start]];
            cE = charMap[pChars[end]];
            if (cS != 0 && cE != 0) {
                if (cS != cE) return false;
                start++;
                end--;
            } else {
                if (cS == 0) start++;
                if (cE == 0) end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "1not, a, type writer1";
        String test1 = "pop";
        String test2 = "aAdsa, dfDD,";
        String[] lineVector = test.split(",");
        System.out.println(test2.toLowerCase());
        DelearTrack1 obj = new DelearTrack1();
        System.out.println(obj.isPalindrome(test1));
        System.out.println(obj.isPalindrome(test));
        System.out.println(obj.isPalindrome(test2));
        System.out.println('1'+0);
        System.out.println(lineVector[2]);
        String[] key = test2.split(",");
        System.out.println(key[1]);
    }
}
