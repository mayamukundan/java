package basics.inheritance;

import basics.classes.pojo.employee.*;

public class AbstractionExample {
    public static void main(String[] args) {

//            new H2kEmployee(12);
            H2kEmployee employee = new ITEmployee(22);
            employee.watchColor();
            employee.tieColor();

//            H2kEmployee employee1 = new TaxEmployee(33);
//            employee1.watchColor(); // Run time polymorphisms

            /*TaxEmployee taxEmployee = new TaxEmployee(33);
            taxEmployee.test();*/
//            employee1.tieColor();

    }
}