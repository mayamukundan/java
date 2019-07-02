package basics.exceptionhandling;

import basics.classes.pojo.Person;

import java.util.Scanner;

/**
 * Created by jrout on 7/1/19.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digits[] = {3,4,5,6,7,8,0,11,23,25}; // 6 -> 0 , index from 0-9

        System.out.println("Enter a value between 0 and 9 : \n");
        int value  = scanner.nextInt();

        int finalCalculation = 1;

        try{
            int divisionValue = digits[value];
            finalCalculation = 300/divisionValue;
            /*try{
                int test = 0;// some other calcuation
            }catch (Exception exp){

            }*/
        }catch (ArithmeticException exp){
            finalCalculation = 2;
        }catch (ArrayIndexOutOfBoundsException exp){
            exp.printStackTrace();
            finalCalculation = 3;
        }catch (Exception exp){
            exp.printStackTrace();
            finalCalculation = 4;

            /*try{

            }catch (Exception expx){

            }*/
        }

        System.out.println("Final Caculation Value "+ finalCalculation);
        int finalDiscount = 500 % finalCalculation;
        System.out.println("The final discount value "+ finalCalculation);

    }
}
