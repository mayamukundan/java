package basics.inheritance;

import basics.classes.pojo.employee.Employee;
import basics.classes.pojo.employee.H2kEmployee;
import basics.classes.pojo.employee.ITEmployee;
import basics.classes.pojo.employee.TaxEmployee;

public class InstanceOfExample {
    public static void main(String[] args) {
        InstanceOfExample ref = new InstanceOfExample();

        H2kEmployee itEmployee = new ITEmployee("Peter","Java",345);
        ref.printDetails(itEmployee);

        H2kEmployee taxEmployee = new TaxEmployee("Tom","House Loan Tax",555);
        ref.printDetails(taxEmployee);
    }

    public void printDetails(H2kEmployee employee) {
        System.out.println(employee.getId());
        System.out.println(employee.getName());

        if(employee instanceof ITEmployee){
            ITEmployee itEmployee = (ITEmployee) employee;
            System.out.println(itEmployee.getProgrammingExperience());
        } else if(employee instanceof TaxEmployee){
            TaxEmployee taxEmployee = (TaxEmployee) employee;
            System.out.println(taxEmployee.getTaxType());
        }
    }
}