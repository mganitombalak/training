import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld  extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // SERVLET INITIALIZATION HERE
        System.out.println("Servlet instance getting up.");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setContentType("text/html");q
        res.setCharacterEncoding("UTF-8");
        PrintWriter streamWriter = res.getWriter();
        streamWriter.append("<!DOCTYPE html>");
        streamWriter.append("<html><head><title>YKB HELLO FORM</title></head><body>");
        streamWriter.append("<form action=\"hello\" method=\"POST\"> First name:");
        streamWriter.append("<input type=\"text\" name=\"name\"><br>");
        streamWriter.append("<input type=\"submit\" value=\"Submit\"/></form>");
        streamWriter.append("</body></html>");
    }

    public  void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
        PrintWriter streamWriter = res.getWriter();
        streamWriter.append("Hello " + req.getParameter("name"));

    }
}
