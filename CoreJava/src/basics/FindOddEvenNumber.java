package basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindOddEvenNumber {
    // java basics.FindOddEvenNumber 3

    public static void main(String[] args) {
        //        int value = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int value1 = scanner.nextInt();

//        System.out.println("Enter second number");
//        int value2 = scanner.nextInt();


        System.out.println("The First Value Entered was :" + value1);
//        System.out.println("The Second Value Entered was :" + value2);

        System.out.println("Module of the number Entered is "+ (value1 % 2));
        System.out.println(" Is it even ?  "+ ((value1 % 2) == 0));

        boolean isEven = (value1 % 2) == 0;
        System.out.println("isEven :"+ isEven);

        if(isEven) {
            System.out.println("It is a Even Number");
        }else {
            System.out.println("It is a Odd Number....");
        }
    }
}