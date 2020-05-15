package chapter9;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter9/include"})

/**
 * Include
 */
public class Include extends HttpServlet{

    public void doGet (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        Page.header(out);
        request.getRequestDispatcher("include1.jsp")
            .include(request, response);
        request.getRequestDispatcher("include2.jsp")
            .include(request, response);
        Page.footer(out);
    }
}