package basics.arrays;

public class MultiDimeArray {
    int tomAge = 22;  // in years
    int peterAge = 33;
    int samAge = 44;

    double tomHeight = 5.5;  // in foot
    double peterHeight = 6.6;
    double samHeight = 4.4;

    int tomWeight = 150;   // in lbs
    int peterWeight = 160;
    int samWeight = 170;

    public static void main(String[] args) {

        MultiDimeArray md1 = new MultiDimeArray();
        md1.printAges();
    }

    public void printAges() {
        //MultiDimeArray md = new MultiDimeArray();
        int ages[] = { tomAge, peterAge, samAge};

        for ( int i=0; i<ages.length; i++) {
            System.out.println("Age of person is :"+ages[i]);
            printHeights();
        }
    }

    void printHeights() {
        double heights[] = {tomHeight, peterHeight, samHeight};
        System.out.println("\n");/* print new line*/
        for ( int j = 0; j < heights.length; j++) {
            System.out.println("Height of person is :"+heights[j]);
        }
    }

    /* Calculate BMI for the person using below formula:
     *
     *       (weight in pounds * 703)
     * BMI = -----------------------
     *        height in inches²
     */
//    public void CalcBmi(int weigh, double heigh) {
    /*public void calcPeterBmi() {
        double bmi = 0;
        double a = (md.peterWeight * 703);
        double b = Math.pow(md.peterHeight , 2);
        bmi =  a/b;
        System.out.println("BMI value of person is :"+bmi);
    }*/
}
