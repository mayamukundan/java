public class FindOddEvenNumber {
    // java FindOddEvenNumber 3

    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);

        if(value % 2 == 0) {
            System.out.println("It is a Even Number");
        }else {
            System.out.println("It is a Odd Number..");
        }
    }
}