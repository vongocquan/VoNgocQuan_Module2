import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", urlPatterns ="/dictionary")
public class DictionaryServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        String search = request.getParameter("txtSearch");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(response.getOutputStream(), StandardCharsets.UTF_8), true);
        String result = dictionary.get(search);
        if (result != null){
            writer.println("work = " +search + "<br/>");
            writer.println("result = " + result);
        }else {
            writer.println("not found");
        }
        writer.println("</html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
