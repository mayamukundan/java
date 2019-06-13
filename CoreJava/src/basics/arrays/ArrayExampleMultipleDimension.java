package basics.arrays;

/**
 * How to loop a 2D array and print all the values.
 */
public class ArrayExampleMultipleDimension {
    public static void main(String[] args) {

        int tomAge = 22;
        int peterAge = 33;
        int samAge = 11;

        int tomHeight = 5;
        int peterHeight = 6;
        int samHeight = 4;

        int ages[] = {tomAge, peterAge,samAge};
//        for(int i = 0 ; i < ages.length ; i++){
//            System.out.println(ages[i]);
//        }
        int height[] = {tomHeight, peterHeight,samHeight};

        int detail[][] = {ages,height}; // add array inside an array

//        for(int i=0 ;i < detail.length; i++) {
            int ages_[] = detail[0];
            for(int j= 0 ; j < ages_.length;j++){
                System.out.println(ages[j]);
            }
//        }

        System.out.println("\nTOm Age : "+detail[0][0]);


    }
}