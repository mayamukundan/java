package basics.classes;

public class ClassesExample {
    public static void main(String[] args) {
        Student tom = new Student();
        tom.name = "Tom";
        tom.height = 4;
        tom.weigth = 50;
        tom.address1 = "Peter Drive";
        tom.address2 = "Marine Street";
        tom.zip = "3333";
        tom.country = "India";

        Student peter = new Student();
        peter.name = "Peter";
        peter.height = 5;
        peter.weigth = 55;
        peter.address1 = "Doll Wood";
        peter.address2 = "Cota Street";
        peter.zip = "322";
        peter.country = "USA";

//        String address = new String("Some Drive");
//        String address = ("Some Drive");

    }


}

class Student {
    String name;
    int height;
    int weigth;

    String address1;
    String address2;
    String zip;
    String country;
}