package basics.arrays;

public class MethodExample {
    public static void main(String[] args) {

        // single line comment

        /* multi line comment */
        int tomAge = 23;
        int peterAge = 22;
        int samAge = 20;

        MethodExample jay = new MethodExample();
        jay.printAge(tomAge);
        jay.printAge(peterAge);
        jay.printAge(samAge);
    }

    // invoke or call
    // methods are of two types : which returns something and another is a void return
    // Void return type
    public void printAge(int age){
        System.out.println("Age is $$$$***** *"+ age+"******$$$$$");
    }
}