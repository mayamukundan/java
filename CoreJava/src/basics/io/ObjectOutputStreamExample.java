package basics.io;

import basics.classes.pojo.Address;
import basics.classes.pojo.Person;

import java.io.*;

/**
 * Created by jrout on 7/5/19.
 */

// Serialization interface is known as a Marker Interface.

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
//        writeAndReadObject();
//        writeObjectToFile();
        readOldObject();

    }

    public static void writeObjectToFile() throws Exception {
        Address address = new Address();
        address.setAddress1("Addres111");
        address.setAddress2("Address222");
        address.setCountry("USA");
        address.setZip("5567");

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("address2.dat"));
        outputStream.writeObject(address);
        outputStream.close();
    }

    public static void readOldObject() throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("address2.dat"));
        Address address = (Address)objectInputStream.readObject();

        System.out.println(address.getZip());
        System.out.println(address.getCountry());
    }

    public static void writeAndReadObject() throws Exception {
        Address address = new Address();
        address.setAddress1("Addres1");
        address.setAddress2("Addres1");
        address.setCountry("USA");
        address.setZip("5567");

//        File file = new File("address.dat");
//        FileOutputStream fileOutputStream = new FileOutputStream("address.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("address1.dat"));
        outputStream.writeObject(address);
        outputStream.close();

        System.out.println("Object has been writted successfully");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("address1.dat"));
        address = (Address)objectInputStream.readObject(); // return of readObject is Object

        System.out.println(address.getZip());
        System.out.println(address.getCountry());
    }
}
