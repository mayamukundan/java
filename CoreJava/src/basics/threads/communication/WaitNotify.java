package basics.threads.communication;

/**
 * Created by jrout on 7/8/19.
 */
public class WaitNotify {
    public static void main(String[] args) {
        CalculatorThread calculatorThread = new CalculatorThread();
        calculatorThread.start();
        // wait
        synchronized (calculatorThread){
            System.out.println("Main Thread is waiting for the child thread to be completed...");
            try {
                calculatorThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Child thread is completed..");

        System.out.println("Total Value is = "+calculatorThread.getTotalValue());
    }
}

class CalculatorThread extends Thread {
    int totalValue; // 0+1+2+3+4+5;
    @Override
    public void run() {
        synchronized (this){
            for(int i=0 ; i < 10; i++) {
                totalValue = totalValue+i;
                System.out.println("Calcuating.....");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notifyAll();
        }


        /**/

        // notify
    }

    public int getTotalValue(){
        return totalValue;
    }
}