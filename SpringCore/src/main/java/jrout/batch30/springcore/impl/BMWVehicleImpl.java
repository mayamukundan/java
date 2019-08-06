package jrout.batch30.springcore.impl;

import jrout.batch30.springcore.IEngineProvider;
import jrout.batch30.springcore.IVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class BMWVehicleImpl implements IVehicle {

    @Autowired
    @Qualifier("engineProvider")
    private IEngineProvider engineProvider;

    public void drivingSpeed() {
        System.out.println("The Driving speed of BMW Vehicle is 150 km/hr..");
//        iEngineProvider = new EngineProviderImpl();
        engineProvider.provider();

    }
    public void vehileName() {
        System.out.println("Vehicle Name is BMW....");
    }

    public void setEngineProvider(IEngineProvider engineProvider) {
        this.engineProvider = engineProvider;
    }
}
