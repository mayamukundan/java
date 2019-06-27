package basics.classes;

/**
 * Created by jrout on 6/26/19.
 */
public enum CoffeeSize {
    SMALL(1), MEDIUM(2), LARGE(3);

    private int value;

    CoffeeSize(int val){
        this.value = val;
    }

    public int getValue(){
        return this.value;
    }

}

enum Months{
    //JAN(1), FEB(2) , MAR(3) , DEC(12)

}
