package basics.classes.pojo.animal;

import basics.classes.Swimming;

/**
 * Created by jrout on 6/26/19.
 */
public class Elephant extends Animal implements Swimming{

    @Override
    public void swim() {
        System.out.println("Elephant swims good in all kind of water...");
    }
}
