package jrout.tutorial.batch30.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloworldwithhtmlresponse")
public class HelloWorldServletWithHTMLResponse extends HttpServlet {

    public HelloWorldServletWithHTMLResponse() {
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
        System.out.println("Inside the doGet Method ");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String occupation = req.getParameter("occupation");


        writer.print("<html>");
        writer.print("<head>\n" +
                "<style>\n" +
                "table {\n" +
                "  font-family: arial, sans-serif;\n" +
                "  border-collapse: collapse;\n" +
                "  width: 100%;\n" +
                "}\n" +
                "\n" +
                "td, th {\n" +
                "  border: 1px solid #dddddd;\n" +
                "  text-align: left;\n" +
                "  padding: 8px;\n" +
                "}\n" +
                "\n" +
                "tr:nth-child(even) {\n" +
                "  background-color: #dddddd;\n" +
                "}\n" +
                "</style>\n" +
                "</head>");
        writer.print("<body>");
        writer.print("<table>");

        writer.print("<tr>");
        writer.print("<th>FirstName</th>");
        writer.print("<th>LastName</th>");
        writer.print("<th>Occupation</th>");
        writer.print("</tr>");

        writer.print("<tr>");
        writer.print("<td>"+firstname+"</td>");
        writer.print("<td>"+lastname+"</td>");
        writer.print("<td>"+occupation+"</td>");
        writer.print("</tr>");
        writer.print("</table>");
        writer.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Inside the doPost Method ");
        doGet(req, resp);
    }

}
