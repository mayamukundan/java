package jrout.tutorial.batch30.webservice.impl;

import jrout.tutorial.batch30.webservice.IHelloWorld;

import javax.jws.WebService;

@WebService(endpointInterface = "jrout.tutorial.batch30.webservice.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld {
    @Override
    public String sayHello(String firstName) {
        return String.format("Hello %s %s , how are you doing. GM !!", firstName, "test");
    }
}