package basics.threads;

/**
 * Created by jrout on 7/5/19.
 */
public class ThreadExample {
    public static void main(String[] args) throws Exception {
        System.out.println("Thread Name "+ Thread.currentThread().getName());

        long startTime = System.currentTimeMillis();

        HorseRunner horseRunner = new HorseRunner();
//        horseRunner.start();

        Thread thread1 = new Thread(horseRunner,"Jayram");
        thread1.start();

        HorseRunner horseRunner2 = new HorseRunner();
//        horseRunner2.start();
        Thread thread2 = new Thread(horseRunner2,"Tom");
        thread2.start();


        long endTime = System.currentTimeMillis();
        System.out.println("Total Time "+ (endTime-startTime)/1000 +" in seconds");

        System.out.println("I am done with my Program..."+ Thread.currentThread().getName());
    }
}
