package basics.arrays;

public class BreakContinue {
    public static void main(String[] args) {
        BreakContinue bc = new BreakContinue();

        int ages[] = bc.getAges();

        for(int index = 0 ; index < ages.length ; index++){
            int value =ages[index];
            if(value == 4) {
               System.out.println("4 is present");
               break;
           }
        }

        for(int index = 0 ; index < ages.length ; index++){
            int value =ages[index];
            if(value == 4) continue;
            System.out.println("Value is "+ value);

        }
    }




















    public int[] getAges(){
        int ages[] = {2,3,4,5,6,7,8,9,1};
        return ages;
    }
}