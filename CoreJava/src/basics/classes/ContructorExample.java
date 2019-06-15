package basics.classes;

import basics.classes.pojo.Employee;

public class ContructorExample {
    public static void main(String[] args) {
        ContructorExample ref = new ContructorExample();

        Employee employee0 = new Employee(33);
        ref.printDetails(employee0);

        Employee employee = new Employee(12,"Tom");
        ref.printDetails(employee);

//        Employee employee1 = new Employee();

    }

    public void printDetails(Employee employee){
        System.out.println("Name ="+employee.name);
        System.out.println("Id ="+employee.id);
        System.out.println("Address ="+employee.address);

    }
}
