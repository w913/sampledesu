package chapter16;

import bean.Product;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/chapter16/attribute")
/**
 * Attribute
 */
public class Attribute extends HttpServlet {

    public void doGet (
        HttpServletRequest req, HttpServletResponse res
    ) throws ServletException, IOException {

        Product p = new Product();
        p.setId(1);
        p.setName("まぐろ");
        p.setPrice(100);

        req.setAttribute("product", p);

        req.getRequestDispatcher("attribute.jsp")
            .forward(req, res);
    }
}