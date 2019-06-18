package basics.method;

import basics.classes.pojo.Employee;
import basics.classes.pojo.Pen;

public class SetterGetterMethodExample {
    public static void main(String[] args) {
//        Employee employee = new Employee(12);
//        System.out.println(employee.id);
//
//        employee.id = -200;
//        System.out.println(employee.id);

        Pen pen = new Pen();
//        pen.length = -10;
        pen.setLength(4);
        pen.setName("Rotomach");
        pen.setBrand("Philip");
        System.out.println(pen);
    }
}