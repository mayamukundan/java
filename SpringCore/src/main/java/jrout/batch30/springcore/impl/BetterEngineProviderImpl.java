package jrout.batch30.springcore.impl;

import jrout.batch30.springcore.IEngineProvider;
import org.springframework.stereotype.Component;

@Component("betterEngineProvider")
public class BetterEngineProviderImpl implements IEngineProvider {
    //betterEngineProviderImpl
    @Override
    public void provider() {
        System.out.println("I provide the best engine for the car with better service..");
    }
}
