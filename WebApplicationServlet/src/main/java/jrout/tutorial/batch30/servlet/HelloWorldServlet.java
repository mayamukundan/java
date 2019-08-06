package jrout.tutorial.batch30.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloworld")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String myname = req.getParameter("myname");
        String occupation = req.getParameter("occupation");

        writer.print("Hello " + myname + "   Time is : <h1>"+  new java.util.Date()+"</h1> </br>");
        writer.print("My Occupation is "+ occupation);
    }
}
