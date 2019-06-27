package basics.classes.pojo.employee;

import basics.classes.Running;
import basics.classes.Swimming;

public class NotITTaxEmployee extends TaxEmployee implements Swimming , Running{

    public NotITTaxEmployee(int id) {
        super(id);
    }

    @Override
    public void swim() {
        System.out.println(" The Not IT Tax employees are the best swimmers in my organization wise...");
    }

    @Override
    public void fastRunner() {
        System.out.println(" They are fast runners too");
    }

    /*@Override
    public void tieColor() {
        System.out.println("The tie color for tax employee will be PURPLE-Black");
    }*/
}
