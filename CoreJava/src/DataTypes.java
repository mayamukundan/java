public class DataTypes {
//    System.out.println("");
    public static void main(String args[]) {
        // Integers
         byte age = 30;
         short age1 = 34;
         int age2 = 33;
         long age3 = 44444444444L;

        //Floating

        float height = 4.5F;
        double distance = 4444.5;

        // Characters
        char a = 'a';

        //Boolean
        boolean isJavaClass = true;

        int heightt = Integer.parseInt(args[0]);
        float discount = .5f;

        float finalDiscount = heightt * discount;

        System.out.println("Final Discount for height "+ heightt +" is :"+finalDiscount);

    }
}
