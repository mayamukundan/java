package jrout.batch30.springcore.impl;

import jrout.batch30.springcore.IVehicle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleImplTest {
    private IVehicle iVehicle = null;

    @Before
    public void setUp(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        iVehicle = (IVehicle)context.getBean("vehicle");
//        iVehicle = new HondaVehicleImpl();
//        iVehicle = new BMWVehicleImpl();
    }

    @Test
    public void vehicleDetails() throws Exception {
        iVehicle.vehileName();
        iVehicle.drivingSpeed();
    }
}