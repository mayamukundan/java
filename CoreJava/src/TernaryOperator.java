import java.util.Scanner;

public class TernaryOperator {
    // java FindOddEvenNumber 3

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1(java) , 2 (python) , 3 (.net)");
        int number = scanner.nextInt();

        String message = (number == 1) ? "This is Java class" : "Do not know anything about this class";
        System.out.println(message);

        /*if(number == 1){
            System.out.println(message);
        }else {
            System.out.println("Do not know anything about this class");
        }*/


    }
}