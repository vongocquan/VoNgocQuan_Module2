import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.geom.Arc2D;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet", urlPatterns = "/display-discount")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        float listPrice = Float.parseFloat(request.getParameter("ListPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));
        float discountAmount;
        writer.println("<html>");
        if (listPrice > 0 && discountPercent > 0){
            discountAmount = (float) (listPrice * discountPercent * 0.1);
            writer.println("<h2> Discount Amount: " + discountAmount + "</h2>");
            writer.println("<h2> Discount Price: " + (listPrice - discountAmount) + "</h2>");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
