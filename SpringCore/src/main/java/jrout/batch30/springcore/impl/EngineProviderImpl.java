package jrout.batch30.springcore.impl;

import jrout.batch30.springcore.IEngineProvider;
import org.springframework.stereotype.Component;

@Component("engineProvider")
public class EngineProviderImpl implements IEngineProvider {

    @Override
    public void provider() {
        System.out.println("I provide the best engine for the car");
    }
}
