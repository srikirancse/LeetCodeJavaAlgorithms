package Easy;

/**
 * Created by Srikiran Sistla on 5/17/2017.
 * Attendance Record 2
 */
public class Q551 {
    public boolean checkRecord(String s) {
        return !s.matches(".*LLL.*|.*A.*A.*");
    }

    public static void main(String[] args) {
        System.out.println("srisri".matches(".*LLL.*|.*A.*A.*"));
    }
}
