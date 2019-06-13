package basics.classes;

public class ClassesExample2 {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.name = "Tom";
        tom.height = 4;
        tom.weigth = 50;
        tom.address1 = "Peter Drive";
        tom.address2 = "Marine Street";
        tom.zip = "3333";
        tom.country = "India";
        ClassesExample2 thisClass = new ClassesExample2();
        Person peter = thisClass.createPerson("Peter",5,55,"DollWood","Cota Street", "322","USA");
        Person sam = thisClass.createPerson("Sam",5,55,"DollWood","Cota Street", "322","USA");
        Person dan = thisClass.createPerson("Dan",5,55,"DollWood","Cota Street", "322","USA");
        Person nancy = thisClass.createPerson("Nancy",5,55,"DollWood","Cota Street", "322","USA");

        System.out.println(peter.name  +" "+ peter.country);
        System.out.println(dan.name  +" "+ dan.country);
        System.out.println(nancy.name  +" "+ nancy.country);
    }

    public Person createPerson(String name , int height, int weight , String address1 , String address2,
                               String zip, String country){
        Person person = new Person();
        person.name = name;
        person.height = height;
        person.weigth = weight;
        person.address1 = address1;
        person.address2 = address2;
        person.zip = zip;
        person.country = country;

        return person;
    }


}


class Person {
    String name;
    int height;
    int weigth;

    String address1;
    String address2;
    String zip;
    String country;
}