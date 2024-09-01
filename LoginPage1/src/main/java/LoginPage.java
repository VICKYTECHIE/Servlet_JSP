import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/add")

public class LoginPage extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uname=request.getParameter("username");
        String pass=request.getParameter("password");
        if(uname.equals("vicky")&&pass.equals("123")){
            HttpSession session=request.getSession();
            session.setAttribute("uname",uname);
            response.sendRedirect("Login.jsp");
        }
    }
}
