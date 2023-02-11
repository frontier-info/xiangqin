package WebText;


import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;


public class Login extends HttpServlet {
  public void doGet(HttpServletRequest request,
                 HttpServletResponse response)throws ServletException, IOException{
   request.getRequestDispatcher("WEB-INF/view/S003001.jsp")
   .forward(request,response);
 }

}