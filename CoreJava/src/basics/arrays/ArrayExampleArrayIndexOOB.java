package basics.arrays;

/**
 * String format
 * ArrayIndexOutOfBoundsException
 */
public class ArrayExampleArrayIndexOOB {
    public static void main(String[] args) {
        String names[] = {"Peter","Pam","Steve"}; // 0 1 2
        for(String name: names) {
            System.out.print(name +"\t");
        }
//        System.out.println(names.length);
//        System.out.printf("Hello %1$s , how %2$s are you  %1$s", names[0] , names[2]);
        System.out.println("\n");
        names[2] = "Gopi";
        for(String name: names) {
            System.out.print(name+"\t");
        }

        // if 3 <= lenght , then i can replace
        // you have to create a new array with some size, and then copy the value from the old array to new
        // and also add the new value which is Dan.
        names[3] = "Dan";
//        System.out.println(names[3]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //	at basics.arrays.ArrayExampleArrayIndexOOB.main(ArrayExampleArrayIndexOOB.java:21)

    }
}