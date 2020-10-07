import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.Date;

public class SessionServlet extends HttpServlet implements Servlet {
       
  public SessionServlet() {}

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String title = "Session Demo";
        
    request.getRequestDispatcher("link.html").include(request, response);  
          
    HttpSession session=request.getSession(false);  
    if(session!=null){  
        String name=(String)session.getAttribute("name");  
          
        out.println("<HTML><HEAD><TITLE>"+title+"</TITLE></HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1 ALIGN=\"CENTER\">" + "Welcome to Session info"  + "</H1>\n" +
                "<TABLE BORDER=1 ALIGN=CENTER>\n" +
                "<TR BGCOLOR=\"#FFAD00\">\n" +
                "  <TH>Info Type<TH>Value\n" +
                "<TR>\n" +
                "  <TD>ID\n" +
                "  <TD>" + session.getId() + "\n" +
                "<TR>\n" +
                "  <TD>Creation Time\n" +
                "  <TD>" + new Date(session.getCreationTime()) + "\n" +
                "<TR>\n" +
                "  <TD>Time of Last Access\n" +
                "  <TD>" + new Date(session.getLastAccessedTime()) + "\n" +
                "<TR>\n" +
                "  <TD>User\n" +
                "  <TD>" + name + "\n" +
                "</TABLE>\n" +
                "</BODY></HTML>");


    }  
    else{  
            out.print("Please login first");  
            request.getRequestDispatcher("login.html").include(request, response);  
    }  
        out.close();  
 }  

     

  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
