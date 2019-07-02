package basics.exceptionhandling;

import basics.exceptionhandling.ude.WrongValueEnteredException;

import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;

/**
 * Created by jrout on 7/1/19.
 * Caught and uncaught exception
 */
public class UserDefinedExceptionExample {
    static int digits[] = {3, 4, 5, 6, 7, 8, 0, 11, 23, 25}; // 6 -> 0 , index from 0-9

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value between 0 and 9 : \n");
        int value = scanner.nextInt();

        int finalCalculation = 1;
        try {
            finalCalculation = finalCalculation(value);
        }catch (WrongValueEnteredException e) {
            e.printStackTrace();
        }catch (Exception exp){
            exp.printStackTrace();
        }finally {
            System.out.println("This will be always executed...");
        }

        System.out.println("Final Caculation Value " + finalCalculation);
        int finalDiscount = 500 % finalCalculation + 40;
        System.out.println("The final discount value " + finalDiscount);

    }

    public static int finalCalculation(int value) throws WrongValueEnteredException {
        int finalResult = 0;
        int divisionValue = digits[value];

        if(divisionValue == 0) {
            throw new WrongValueEnteredException("Wrong Value is entered ["+value+"]" );
        }
        finalResult = 300 / divisionValue;

        return finalResult;
    }

}
