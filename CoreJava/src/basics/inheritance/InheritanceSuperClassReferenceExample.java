package basics.inheritance;

import basics.classes.pojo.employee.*;

public class InheritanceSuperClassReferenceExample {
    public static void main(String[] args) {
        InheritanceSuperClassReferenceExample ref = new InheritanceSuperClassReferenceExample();

        ITEmployee itEmployee = new ITEmployee(345,"Peter");
//        ref.printEmployeeDetails2(itEmployee);
        ref.printCommonDetails(itEmployee);

        TaxEmployee taxEmployee = new TaxEmployee(555);
//        ref.printEmployeeDetails(taxEmployee);
        ref.printCommonDetails(taxEmployee);


        // Creating an Object by having the super class the reference.
        H2kEmployee itEmployee1 = new ITEmployee(345,"Peter");
        ref.printCommonDetails(itEmployee1);
        itEmployee1.toString();

        H2kEmployee taxEmployee1 = new TaxEmployee(555);
        ref.printCommonDetails(taxEmployee1);
        ref.toString();

        Object object = new TaxEmployee(333);
        System.out.println(object.toString());

//        Employee employee = new ITTaxEmployee(222); //ITTaxEmployee --> TaxEmployee --> Employee --> Object
//        TaxEmployee employee1 = new ITTaxEmployee(222);

    }

    public void printCommonDetails(H2kEmployee employee) {
        System.out.println(employee.getId());
        System.out.println(employee.getDepartment());
        System.out.println(employee.getName());
    }

    public void printEmployeeDetails(TaxEmployee taxEmployee) {
        System.out.println(taxEmployee.getId());
        System.out.println(taxEmployee.getDepartment());
        System.out.println(taxEmployee.getName());
    }

    public void printEmployeeDetails2(ITEmployee itEmployee) {
        System.out.println(itEmployee.getId());
        System.out.println(itEmployee.getDepartment());
        System.out.println(itEmployee.getName());
    }

}
