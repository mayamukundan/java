package basics.threads.sync;

/**
 * Created by jrout on 7/8/19.
 */
public class SyncExample {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(printer,"John");
        Thread thread2 = new Thread(printer,"Peter");
        Thread thread3 = new Thread(printer,"Sam");
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


