package jrout.batch30.rmiserver.impl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class ArrayListTest {


    /**
     * Peter Tom Herb Ben Yaman
     * Peter Tom ****** Herb Ben Yaman
     * @throws Exception
     */
    @Test
    public void arrayListTest_1()throws Exception {
        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Tom");
        names.add("Herb");
        names.add("Ben");
        names.add("Yaman");
        System.out.println(names);
        names.add(2,"**********");
        System.out.println(names);
        assertNotNull(names);
    }

    @Test
    public void arrayListTest_duplicate_2()throws Exception {
        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Peter");
        names.add("Tom");
        names.add("Herb");
        names.add("Ben");
        names.add("Yaman");
        System.out.println(names);
        assertNotNull(names);
    }

    @Test
    public void arrayListTest_sort_2()throws Exception {
        List<String> names = new ArrayList<>();
        names.add("E");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("A");
        names.add("F");

        System.out.println(names);
//        names.sort();
        System.out.println(names);
        assertNotNull(names);
    }

    @Test
    public void testListObjectSort(){
        ArrayList<Light> lights = new ArrayList<>();
        lights.add(new Light("Philip","Philips"));
        lights.add(new Light("DuoPhilip","Philips"));
        lights.add(new Light("Radar","Apple"));
        lights.add(new Light("micro","Microsoft"));

        System.out.println(lights);
        // Find out how to sort a list of object based on their property.
    }
}
class Light{
    private String name;
    private String company;

    public Light(String name, String company){
        this.name = name;
        this.company = company;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "["+this.name +" "+ this.company+"]";
    }
}