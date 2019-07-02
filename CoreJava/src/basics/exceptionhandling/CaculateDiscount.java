package basics.exceptionhandling;

/**
 * Created by jrout on 7/1/19.
 */
public class CaculateDiscount {
    static int digits[] = {3,4,5,6,7,8,0,11,23,25}; // 6 -> 0 , index from 0-9
    public static int finalCalculation(int value) {
        int finalResult = 0;
        int divisionValue = digits[value];
        finalResult = 300/divisionValue;

        return finalResult;
    }
}
