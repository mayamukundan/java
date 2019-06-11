package basics.method;

public class MethodsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // output of the above a and b will be added to c


        MethodsExample methodsExample = new MethodsExample();
        int result = methodsExample.add(a,b);

        int c = 30;

        int result2 = methodsExample.add(result,c);

        System.out.println(result2);
//        int result1 = methodsExample.addAndPrint(a,b);

        methodsExample.addAndPrint(2,3,"THis is a simple addition");
    }

    public int add(int a , int b){
        int result = a + b;
        return result;
    }

    /**
     *
     * @param a
     * @param b
     */
    public void addAndPrint(int a, int b, String message) {
        int result = a + b;
        System.out.println(message+"-----"+ result);
    }








}
