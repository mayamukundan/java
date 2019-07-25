package jrout.batch30.springcore.impl;

import jrout.batch30.springcore.IVehicle;
import org.junit.Before;
import org.junit.Test;

public class HondaVehicleImplTest {
    private IVehicle iVehicle = null;

    @Before
    public void setUp(){
//        iVehicle = new HondaVehicleImpl();
        iVehicle = new BMWVehicleImpl();
    }

    @Test
    public void drivingSpeed() throws Exception {
        iVehicle.drivingSpeed();
    }

    @Test
    public void vehicleDetails() throws Exception {
        iVehicle.vehileName();
        iVehicle.drivingSpeed();
    }
}