package basics.arrays;

/**
 * Create an age array.
 *
 * create a method named forLoop and pass the age array and print the values
 * create a method named whileLoop and pass the age array and print the values
 * create a method named doWhile and pass the age array and print the values
 *
 */
public class ArrayLoopExample {
    public static void main(String[] args) {
        int ages[] = {2,3,4,5,6,7,8,9,1};
//        int ages[] = new int[10]; // the size of the array is 10

        // create a boolean array and print it.
        // create a floating point array and print it.

        /*for(int index = 0 ; index < ages.length ; index++){
            System.out.println("Age is $$$$***** *"+ ages[index]+"******$$$$$");
        }*/
        /**
         * Enhanced For loop
         */
        /*for(int age : ages) {
            System.out.println("Age is $$$$***** *"+ age+"******$$$$$");
        }*/

        int index = 0 ;

        /*while(index < ages.length) {
            System.out.println("Age is $$$$***** *"+ ages[index]+"******$$$$$");
            index++;
        }*/

        /*do {
            System.out.println("Age is $$$$***** *"+ ages[index]+"******$$$$$");
            index++;
        }while (index < ages.length);*/
    }
}