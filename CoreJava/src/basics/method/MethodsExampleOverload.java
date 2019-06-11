package basics.method;

public class MethodsExampleOverload {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        MethodsExampleOverload methodsExample = new MethodsExampleOverload();
//        int result = methodsExample.add(a,b);
        int result = methodsExample.add(a,b);
        System.out.println(result);
        result = methodsExample.add(a,b,c);
        System.out.println(result);
    }

    // Method Overloading
    public int add(int a , int b){
        return a + b;
    }

    public int add(int a , int b, int c){
        return a + b + c;
    }
}
