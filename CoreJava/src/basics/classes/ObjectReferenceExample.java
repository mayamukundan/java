package basics.classes;

import basics.classes.pojo.Person;

public class ObjectReferenceExample {
    public static void main(String[] args) {
        // Remote Ctrl = TV
//        Person person = new Person(); // TV
//        person.name = "Peter";
//        System.out.println(person.name);
//        Person person1 = person;
//        person1.name ="Tom";
//        System.out.println(person.name);
        ObjectReferenceExample objRef = new ObjectReferenceExample();
        int a = 10;
        System.out.println("Before :"+ a);
        objRef.changePremetiveValue(a); // Pass by Value
        System.out.println("After :"+a);

        Person person = new Person();
        System.out.println(person);
        person.name = "Tom";
        System.out.println("Before Person :"+ person.name);
        objRef.changeObjectReferenceValue(person); // Pass by Reference
        System.out.println("After Person :"+ person.name);

        String name = new String("Banta");
        objRef.changeMeAgain(name);
        System.out.println(name);


    }


    public void changePremetiveValue(int a) {
        a = 100;
    }

    public void changeObjectReferenceValue(Person person) {
        person.name = "John";
    }

    public void changeMeAgain(String name){
        name = "Santa";
    }
}
