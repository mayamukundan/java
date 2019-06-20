package basics;

import basics.classes.pojo.Pen;

public class StaticMethodExample {
//    static {
//        System.out.println("Hello..i am static block");
//    }
    static public void main(String[] args) {

        /*StaticMethodExample ref = new StaticMethodExample();
        ref.callMe();
        System.out.println("At the end..");
        StaticMethodExample.callMeDirectly();
        callMeDirectly();
        System.out.println(Pen.count);*/

        Pen pen = new Pen();
        System.out.println(Pen.count );
//        System.out.println(Pen.main(););

    }

    public void callMe(){
        System.out.print("Hello");
        callMeAgain();
//        callMeDirectly();
    }

    public void callMeAgain(){
        System.out.print(" Guys");
    }

    public static void callMeDirectly(){
        System.out.println("Call Direct");
    }
}
