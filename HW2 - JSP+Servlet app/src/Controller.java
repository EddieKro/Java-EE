import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.List;


@WebServlet(name = "/Controller", urlPatterns = "/Controller")
public class Controller extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String par = request.getParameter("number");
        Model model = new Model();

        List answer = model.getAnswer(Integer.parseInt(par));

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        request.setAttribute("attr", answer);
        view.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
