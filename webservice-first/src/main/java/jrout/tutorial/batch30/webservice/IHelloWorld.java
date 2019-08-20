package jrout.tutorial.batch30.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface IHelloWorld {
//    @WebMethod
//    String sayHello(String firstName, String lastName);

    @WebMethod
    String sayHello(String firstName);
}
