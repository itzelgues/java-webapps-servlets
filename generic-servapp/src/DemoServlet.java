import java.io.*;
import javax.servlet.*;

public class DemoServlet implements Servlet {
   
   ServletConfig config=null;
   ServletContext context = null;

   public void init(ServletConfig config){
      this.config=config;
      System.out.println("Initialization complete");
   }

   public void service(ServletRequest req, ServletResponse res)
	   throws IOException, ServletException{

       context = req.getServletContext();

       res.setContentType("text/html");
       PrintWriter pwriter=res.getWriter();
       pwriter.print("<html>");
       pwriter.print("<body>");
       pwriter.print("<h1>Hi, I'm a Generic Servlet</h1>");
       pwriter.print("</body>");
       pwriter.print("</html>");

       context.log("Running service()");
   }
  
   public void destroy(){
       System.out.println("servlet life cycle finished");
       context.log("Destroyed");
   }
  
   public ServletConfig getServletConfig(){
       return config;
   }
  
   public String getServletInfo(){
       return "A Demo program written by ...";
   }
}
