package basics.threads;

/**
 * Created by jrout on 7/5/19.
 */
public class HorseRunner implements Runnable {

    public HorseRunner(){

    }
    public HorseRunner(String horseRider){
        //super(horseRider);
    }

    @Override
    public void run() {
        int miles[] = {1,2,3,4,5};
        for(int mile : miles){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(mile +" Thread Name "+ Thread.currentThread().getName() );
        }
    }
}
