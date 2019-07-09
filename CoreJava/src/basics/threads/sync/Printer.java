package basics.threads.sync;

/**
 * Created by jrout on 7/8/19.
 */
public class Printer implements Runnable {

    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Printing Message from [" + i + "] " + Thread.currentThread().getName());
        }
    }


    /*@Override
    public void run() {
        synchronized(this){
            for (int i = 0; i < 5; i++) {
                System.out.println("Printing Message from [" + i +"] "+ Thread.currentThread().getName());
            }
        }

    }*/
}
