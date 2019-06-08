package basics.arrays;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        /* multi line comment */
        int tomAge = 22;
        int peterAge = 33;
        int samAge = 11;

        //        int ageBag2[] = {tomAge,peterAge,samAge};
        int ageBag[] =  new int[3];
        ageBag[0] = tomAge;
        ageBag[1] = peterAge;
        ageBag[2] = samAge;

        ArrayExample jay = new ArrayExample();
        jay.printAllAge(ageBag);
    }

    // invoke or call
    // methods are of two types : which returns something and another is a void return
    // Void return type
    public void printAge(int age){
        System.out.println("Age is $$$$***** *"+ age+"******$$$$$");
    }

    public void printAllAge(int ages[]){
        for(int i = 0 ; i < ages.length ; i++){
            System.out.println(i);  // how to loop an array using while loop, do while loop and for loop.
            System.out.println("Age is $$$$***** *"+ ages[i]+"******$$$$$");
        }
    }
}