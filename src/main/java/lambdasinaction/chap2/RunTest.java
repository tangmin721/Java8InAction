package lambdasinaction.chap2;

/**
 * Created by tangm on 2017/7/1.
 */
public class RunTest {
    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("hello word");
        }).run();

    }
}
