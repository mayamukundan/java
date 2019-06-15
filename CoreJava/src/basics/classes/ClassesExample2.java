package basics.classes;

import basics.classes.pojo.Person;

public class ClassesExample2 {
    public static void main(String[] args) {
        ClassesExample2 thisClass = new ClassesExample2();

        Person tom = thisClass.createPerson("Tom",4,50,"DollWood","Cota Street", "322","USA");
        Person peter = thisClass.createPerson("Peter",5,55,"DollWood","Cota Street", "322","USA");
        Person sam = thisClass.createPerson("Sam",5,55,"DollWood","Cota Street", "322","USA");
        Person dan = thisClass.createPerson("Dan",5,55,"DollWood","Cota Street", "322","USA");
        Person nancy = thisClass.createPerson("Nancy",5,55,"DollWood","Cota Street", "322","USA");

//        System.out.println(peter.name  +" "+ peter.country);
//        System.out.println(dan.name  +" "+ dan.country);
//        System.out.println(nancy.name  +" "+ nancy.country);
    }

    public Person createPerson(String name , int height, int weight , String address1 , String address2,
                               String zip, String country){
        Person person = new Person();
        person.name = name;
        person.height = height;
        person.weigth = weight;
//        person.address1 = address1;
//        person.address2 = address2;
//        person.zip = zip;
//        person.country = country;

        return person;
    }
}


