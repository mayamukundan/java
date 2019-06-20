package basics;

import basics.classes.pojo.Pen;

import java.awt.event.PaintEvent;

public class ClassLevelVariable {
    public static void main(String[] args) {
        /*Pen mysomething = new Pen("Peter");
        System.out.println("before "+mysomething.count);

        Pen.count = 10;

        System.out.println("After "+ mysomething.count);

        Pen p1 = new Pen();

        System.out.println("P1 count "+ p1.count);*/


//        Pen p1 = new Pen();

        for(int i = 0 ; i < 100; i++){
            new Pen();
        }


        System.out.println(Pen.count);


    }


}
