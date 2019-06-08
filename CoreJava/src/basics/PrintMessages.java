package basics;

import java.util.Scanner;

public class PrintMessages {
    // java basics.FindOddEvenNumber 3

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1(java) , 2 (python) , 3 (.net)");
        int number = scanner.nextInt();

        /*if(number == 1){
            System.out.println(" This is Java class");
        } else if (number == 2){
            System.out.println("This is Python class");
        }else if ( number == 3) {
            System.out.println("This is .Net class");
        }else {
            System.out.println("Do not know anything about this class");
        }*/

        if(number != 10) {
            System.out.println("You are in a Java Class");
        }else{
            System.out.println("You are in Python class");
        }

    }
}