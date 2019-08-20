package jrout.tutorial.batch30.webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloWorldClient {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://localhost:8888/ws/hello?wsdl");
            QName qname = new QName("http://impl.webservice.batch30.tutorial.jrout/","HelloWorldImplService");
            Service service = Service.create(url,qname);

            IHelloWorld helloWorld = service.getPort(IHelloWorld.class);

            String message = helloWorld.sayHello("Peter");
            System.out.println(message);

        }catch (Exception exp){
            exp.printStackTrace();
        }
    }
}
