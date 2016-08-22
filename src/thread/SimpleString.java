package thread;

/**
 * Created by JOKER on 3/22/15.
 */
public class SimpleString implements Runnable {

    String str;
    int i = 0;
    SimpleString(String str){
        this.str = str;
    }

    public void run() {
        while(i!=100){
            i++;
            if(i%5==0){
                Thread.yield();
            }
            System.out.print(str);
            System.out.println();
        }

    }
}
