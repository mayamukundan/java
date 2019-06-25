package basics;

import basics.classes.pojo.Pen;

/**
 * Garbage Collector is a demon thread which frees up the memory.
 */
public class GarbageCollection {
    public static void main(String[] args) {

        for(int i= 0 ; i < 500000;i++) {
            new Pen(i+"");
        }
    }
}
