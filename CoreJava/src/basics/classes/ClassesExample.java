package basics.classes;

import basics.classes.pojo.Person;
import basics.classes.pojo.Student;

// By Defaul java.lang package will be available for every single class in java.
//import java.lang.String;
//import java.lang.Math;
import basics.classes.pojo.Address;
public class ClassesExample {
    public static void main(String[] args) {

//        String name = "";
//        Math.abs(23);

        Address tomAddress = new Address();
        tomAddress.address1 = "Peter Drive";
        tomAddress.address2 = "Marine Street";
        tomAddress.zip = "3333";
        tomAddress.country = "India";

        Student tom = new Student();
        tom.name = "Tom";
        tom.height = 4;
        tom.weigth = 50;
        tom.address = tomAddress;

        Student peter = new Student();
        peter.name = "Peter";
        peter.height = 5;
        peter.weigth = 55;

        Address peterAddress = new Address();
        peterAddress.address1 = "Doll Wood";
        peterAddress.address2 = "Cota Street";
        peterAddress.zip = "322";
        peterAddress.country = "USA";
        peter.address = peterAddress;

//        String address = new String("Some Drive");
//        String address = ("Some Drive");
//        SpecialKitchen kitchen;
    }


}

