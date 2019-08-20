package jrout.tutorial.batch30.webservice;

import jrout.tutorial.batch30.webservice.impl.HelloWorldImpl;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/hello",new HelloWorldImpl());
        System.out.println("Hello World Service is been published...");
    }
}
