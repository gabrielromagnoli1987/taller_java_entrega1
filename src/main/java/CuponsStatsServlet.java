import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/cuponsStats")
public class CuponsStatsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HashMap<String, Integer> cupons = (HashMap<String, Integer>) getServletContext().getAttribute("cupons");
//        for (Map.Entry entry : cupons.entrySet()) {
//            System.out.println("Key: "+ entry.getKey() + " & Value: " + entry.getValue());
//        }
        resp.sendRedirect("cuponsStats.jsp");
    }
}
