package chapter15;

import bean.Product;
import dao.ProductDAO;
import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/chapter15/insert")
/**
 * Insert
 */
public class Insert extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        Page.header(out);
        try {
            String name = req.getParameter("name");
            int price = Integer.parseInt(req.getParameter("price"));

            Product p = new Product();
            p.setName(name);
            p.setPrice(price);

            ProductDAO dao = new ProductDAO();

            int line = dao.insert(p);
            if (line > 0) {
                out.println("追加に成功しました。");
            }
        } catch (Exception e) {
            e.printStackTrace(out);
        }
        Page.footer(out);
    }
}