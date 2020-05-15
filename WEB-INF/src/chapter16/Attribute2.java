package chapter16;

import bean.Product;
import dao.ProductDAO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.List;

@WebServlet("/chapter16/attribute2")
/**
 * Attribute2
 */
public class Attribute2 extends HttpServlet {

    public void doGet (
        HttpServletRequest req, HttpServletResponse res
    ) throws ServletException, IOException {

        try {
            ProductDAO dao = new ProductDAO();
            List<Product> list = dao.search("");

            req.setAttribute("list", list);
    
            req.getRequestDispatcher("attribute2.jsp")
                .forward(req, res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}