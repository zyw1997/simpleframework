import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/12 11:55
 * @Description:
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String word = "你好！郑逸文";
        req.setAttribute("word", word);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);

    }
}
