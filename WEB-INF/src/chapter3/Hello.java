package chapter3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter3/hello"})
public class Hello extends HttpServlet {
    public void doGet (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello Servlet!");
        out.println(new java.util.Date());
    }
}