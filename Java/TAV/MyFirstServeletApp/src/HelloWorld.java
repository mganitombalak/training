import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet instance is creating up!");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter streamWriter = response.getWriter();
        streamWriter.append("<!DOCTYPE html>");
        streamWriter.append("<html><head><title>TAV HELLO FORM</title></head><body>");
        streamWriter.append("<form action=\"hello\" method=\"POST\"> First name:");
        streamWriter.append("<input type=\"text\" name=\"adi\"><br>");
        streamWriter.append("<input type=\"submit\" value=\"Submit\"/></form>");
        streamWriter.append("</body></html>");
    }

    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter streamWriter = response.getWriter();
        streamWriter.append("Hello " + request.getParameter("adi"));
    }
}
