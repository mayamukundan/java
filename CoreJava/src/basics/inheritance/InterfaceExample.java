package basics.inheritance;

import basics.classes.Running;
import basics.classes.Swimming;
import basics.classes.pojo.Person;
import basics.classes.pojo.animal.Animal;
import basics.classes.pojo.animal.Elephant;
import basics.classes.pojo.employee.H2kEmployee;
import basics.classes.pojo.employee.ITTaxEmployee;
import basics.classes.pojo.employee.NotITTaxEmployee;

public class InterfaceExample {
    public static void main(String[] args) {
        Swimming swimming1 = new NotITTaxEmployee(222);
        swimming1.swim();
        Swimming swimming2 = new Elephant();
        swimming2.swim();

//        printSomething(swimming1);
//        printSomething(swimming2);

        Running running = new NotITTaxEmployee(222);
        running.fastRunner();
    }

    public static void printSomething(Swimming swimming){
        swimming.swim();
    }


}