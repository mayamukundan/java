package basics.recursion;

public class FactorialExample {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

//        int value = factorial.fact(2); // 2 * 1 = 6
        int value = factorial.fact(3); // 3 * 2 * 1 = 6
//        factorial.fact(4); // 4 * 3 * 2 * 1 = 24

        System.out.println("Factorial result ="+ value);

    }
}

class Factorial{
    int fact(int num){
        int result;
        if(num == 1) {
            return num;
        }
        int tempValue = fact(num-1); // 2-1;
        result =  num * tempValue;
        return result;
    }
}
