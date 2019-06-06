import java.util.Scanner;

public class BooleanLogicalOperator {
    // java FindOddEvenNumber 3

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Language number :  1(java) , 2 (python) , 3 (.net)");
        int number = scanner.nextInt();

        System.out.println(" Enter topic number : 10(Core) , 11(Advance)");
        int topic = scanner.nextInt();

        boolean isJava = number == 1;
        boolean isAdv = topic == 11;

        /*if(isJava && isAdv) {
            System.out.println(" This is Java Advance course");
        }*/

        if(isJava || isAdv && true) {
            System.out.println(" This is programming class");
        }

        /*if(isJava && isAdv) {
            System.out.println(" This is Java Advance course");
        }*/

        /*if(isJava){
            System.out.println(" This is Java course");
        }


        if(isAdv) {
            System.out.println("This is Advance Course");
        }*/


    }
}