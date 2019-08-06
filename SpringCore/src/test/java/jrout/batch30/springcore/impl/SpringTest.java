package jrout.batch30.springcore.impl;


import jrout.batch30.springcore.IVehicle;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testSpringBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IVehicle vehicle = (IVehicle)context.getBean("vehicle");
        IVehicle vehicle = context.getBean("vehicle",IVehicle.class);
        System.out.println(vehicle.hashCode());

        vehicle = (IVehicle)context.getBean("vehicle");
        System.out.println(vehicle.hashCode());

//        IVehicle vehicle = new BMWVehicleImpl();
//        vehicle.drivingSpeed();
    }
}
