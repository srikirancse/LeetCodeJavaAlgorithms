package Easy;

/**
 * Created by Srikiran Sistla on 3/21/2017.
 */

abstract class Arithmetic{
    abstract int add(int a, int b);
}
public class Adder extends Arithmetic{
    @Override
    int add(int a, int b) {
        System.out.println(Adder.class.getSuperclass());
        System.out.printf(a+b+"");
        return a+b;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(3,4);
    }
}
