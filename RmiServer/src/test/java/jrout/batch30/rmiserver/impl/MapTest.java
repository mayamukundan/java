package jrout.batch30.rmiserver.impl;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.*;

public class MapTest {
    private static Logger logger = Logger.getLogger(MapTest.class);

    @Test
    public void mapTest()throws Exception {
        // 10 : Peter
        // 11 : Tom

        Map idToName = new HashMap();
        idToName.put(10,"Peter");
        idToName.put(11,"Tom");
        idToName.put(12,"Ben");
        idToName.put(13,"Yaman");

        logger.info(idToName);

        logger.info(idToName.get(12));

        // loop the map and print all the key and value...


    }


    @Test
    public void mapTest_()throws Exception {
        List<String> teacher = new ArrayList<>();
        teacher.add("TOne");
        teacher.add("TTwo");
        teacher.add("TThree");
        teacher.add("TFour");

        List<String> students = new ArrayList<>();
        students.add("SOne");
        students.add("STwo");
        students.add("SThree");
        students.add("SFour");

        Map<String, List<String> > stPaulSchool = new HashMap<>();
        stPaulSchool.put("teacher",teacher);
        stPaulSchool.put("student",students);


        Map<String, List<String> > vsSchool = new HashMap<>();
        vsSchool.put("teacher",teacher);
        vsSchool.put("student",students);


        List<Map<String, List<String> >> schools = new ArrayList();
        schools.add(stPaulSchool);
        schools.add(vsSchool);
//        schools.add(1);

        logger.info(stPaulSchool);
        /// callMe(schools);
        // loop the map and print all the key and value...


    }

}