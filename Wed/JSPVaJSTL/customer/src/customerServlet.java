import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customerServlet", urlPatterns = "/index")
public class customerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String[]> customers = new ArrayList<>();
        String[] customer1 = {"Mai Văn Hoàn", "1983-08-20", "Hà Nội", "MaiVanHoan.jpg"};
        String[] customer2 = {"Nguyễn Đình Thi", "1997-04-02", "Huế", "NguyenDinhThi.jpg"};
        customers.add(customer1);
        customers.add(customer2);
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("/Customer.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
