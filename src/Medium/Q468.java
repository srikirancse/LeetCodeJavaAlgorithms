package Medium;

/**
 * Created by Srikiran Sistla on 5/21/2017.
 */
public class Q468 {

    public static final String OUTPUT_1 = "IPv4";
    public static final String OUTPUT_2 = "IPv6";
    public static final String OUTPUT_3 = "Neither";

    public String validIPAddress(String IP) {
        int len = IP.length();
        if (len < 7 || len > 39 || IP.charAt(len-1) == '.' || IP.charAt(len-1) == ':' || IP.indexOf('.') >= 0 == IP.indexOf(':') >= 0) return OUTPUT_3;
        if (IP.indexOf('.') >= 0) return checkIPV4(IP);
        return checkIPV6(IP);
    }

    private String checkIPV4(String ip) {
        int start = 0, count = 0;
        for (int i = 0; i <= ip.length(); i++) {
            if (i == ip.length() || ip.charAt(i) == '.'){
                count++;
                String substr = ip.substring(start, i);
                System.out.println(substr);
                if (count > 4 || substr.length() == 0 || substr.length() > 3 || substr.charAt(0) == '0' || !substr.matches("[0-9]*") || Integer.valueOf(substr) > 255) return OUTPUT_3;
                start = i+1;
            }
        }
        return count == 4 ? OUTPUT_1 : OUTPUT_3;
    }

    private String checkIPV6(String ip) {
        int start = 0, count = 0;
        for (int i = 0; i <= ip.length(); i++) {
            if (i == ip.length() || ip.charAt(i) == ':'){
                count++;
                String substr = ip.substring(start, i);
                if (count > 8 || substr.length() == 0 || substr.length() > 4) return OUTPUT_3;
                start = i+1;
            }
        }
        System.out.println(count);
        return count == 8 ? OUTPUT_2 : OUTPUT_3;
    }

    public String validIPAddress2(String IP) {
        if(IP.matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])")) return "IPv4";
        else if (IP.matches("([0-9a-fA-F]{1,4}:){7}([0-9a-fA-F]{1,4})")) return "IPv6";
        return "Neither";
    }

    public static void main(String[] args) {
        Q468 q468 = new Q468();
        System.out.println(q468.validIPAddress("172.16.254.1"));
    }
}
