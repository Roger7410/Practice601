package thread;

/**
 * Created by JOKER on 3/22/15.
 */
public class ThreadTest {

    public static void main(String[] args) {
        SimpleString ss1 = new SimpleString("aaa");
        SimpleString ss2 = new SimpleString("bbbb");
        Thread t1 = new Thread(ss1);
        Thread t2 = new Thread(ss2);
        t1.start();
        try {
            t1.join();
            System.out.println("t1 done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }

}
