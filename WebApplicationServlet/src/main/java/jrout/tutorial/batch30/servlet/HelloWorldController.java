package jrout.tutorial.batch30.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloworldcontroller")
public class HelloWorldController extends HttpServlet {

    public HelloWorldController() {
        System.out.println("This is my Constructor...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("This is INIT Method");
    }

    @Override
    public void destroy() {
        System.out.println("This is Destroy Method....");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("helloworld.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Inside the doPost Method ");
        doGet(req, resp);
    }

}
