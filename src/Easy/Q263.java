package Easy;

/**
 * Created by Srikiran Sistla on 3/29/2017.
 */
public class Q263 {
    public boolean isUgly(int num) {
        if (num>0){
            for (int i = 2; i < 6; i++)
                while (num%i == 0)
                    num /= i;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
