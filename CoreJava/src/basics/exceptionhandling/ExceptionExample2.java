package basics.exceptionhandling;

import java.util.Scanner;

/**
 * Created by jrout on 7/1/19.
 * Caught and uncaught exception
 */
public class ExceptionExample2 {
    static int digits[] = {3,4,5,6,7,8,0,11,23,25}; // 6 -> 0 , index from 0-9

    public static void main(String[] args) throws Exception {
        mainEnterance();

    }

    public static void mainEnterance(){
        try{
            /*Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a value between 0 and 9 : \n");
            int value  = scanner.nextInt();

            int finalCalculation = 1;
            finalCalculation = finalCalculation(value);*/

            callMeForCalcuation();

        /*try {
            finalCalculation = finalCalculation(value);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

            /*System.out.println("Final Caculation Value "+ finalCalculation);
            int finalDiscount = 500 % finalCalculation + 40;
            System.out.println("The final discount value "+ finalDiscount);  */
        }catch (Exception exp){

        }
    }

    public static int  callMeForCalcuation() throws Exception {
        return  finalCalculation(5);
    }

    public static int finalCalculation(int value) throws Exception {
        int finalResult = 0;
        int divisionValue = digits[value];
        finalResult = 300/divisionValue;

        return finalResult;
    }

}
