package basics.classes;

/**
 * Created by jrout on 6/26/19.
 */
public class EnumExample {

    public static void main(String[] args) {
//        coffeeSize(7);
        coffeeSizeWithEnum(CoffeeSize.MEDIUM);
    }

    public static void coffeeSize(int val){
        if(val == 1) {
            System.out.println("Coffee size is Small");
        }else if(val == 2) {
            System.out.println("Coffee size is Medium");
        }else if(val == 3) {
            System.out.println("Coffee size is Large");
        }
    }

    public static void coffeeSizeWithEnum(CoffeeSize coffeeSize){
        if(coffeeSize == CoffeeSize.SMALL) {
            System.out.println("Coffee size is Small " + coffeeSize.getValue());
        }else if(coffeeSize == CoffeeSize.MEDIUM) {
            System.out.println("Coffee size is Medium "+ coffeeSize.getValue());
        }else if(coffeeSize == CoffeeSize.LARGE) {
            System.out.println("Coffee size is Large "+ coffeeSize.getValue());
        }
    }
}



