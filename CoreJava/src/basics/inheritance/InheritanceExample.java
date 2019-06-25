package basics.inheritance;

import basics.classes.pojo.employee.ITEmployee;
import basics.classes.pojo.employee.TaxEmployee;

public class InheritanceExample {
    public static void main(String[] args) {
        ITEmployee itEmployee = new ITEmployee(345,"Peter");
        System.out.println(itEmployee.getId());
        System.out.println(itEmployee.getProgrammingExperience());


        TaxEmployee taxEmployee = new TaxEmployee(555);
        System.out.println(taxEmployee.getId());



    }
}
