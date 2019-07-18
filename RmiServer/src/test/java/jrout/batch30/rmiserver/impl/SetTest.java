package jrout.batch30.rmiserver.impl;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertNotNull;

public class SetTest {
    private static Logger logger = Logger.getLogger(SetTest.class);
    @Test
    public void arrayListTest_sort_2()throws Exception {
        List<String> names = new ArrayList<>();
        names.add("Elephant");
        names.add("Elephant");
        names.add("Boy");
        names.add("Cat");
        names.add("Delhi");
        names.add("Andaman");
        names.add("Andaman");
        names.add("Figure");

        logger.info(names);
//        System.out.println(names);

        Set<String> setAlphabets = new TreeSet<>(names);
        setAlphabets.add("Boston");
//        Set<String> setAlphabets = new HashSet<>(names);
        logger.info(setAlphabets);
        //System.out.println(setAlphabets);
        setAlphabets.size();
        setAlphabets.clear();

        setAlphabets.contains("Figure");
    }

}