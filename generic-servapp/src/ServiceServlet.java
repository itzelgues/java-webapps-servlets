
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet{
   
   ServletConfig config=null;
   ServletContext context = null;

   public void init(ServletConfig config){
      this.config=config;
   }

   public void service(HttpServletRequest request, HttpServletResponse response) 
		   throws IOException, ServletException {
   
       	 String method = request.getMethod();

	if (method.equals("GET")) {
        	//doGet(req, resp);
		/*context = request.getServletContext();

      		response.setContentType("text/html");
       		
		PrintWriter pwriter=response.getWriter();
      		pwriter.print("<html>");
       		pwriter.print("<body>");
      		pwriter.print("<h1>Hi, I'm a Generic Servlet</h1>");
       		pwriter.print("<p>I dispatched the request to the doGet() method</p>");
       		pwriter.print("</body>");
      		pwriter.print("</html>");*/

	} else if (method.equals("POST")) {
    		doPost(request, response);
	} else if (method.equals("PUT")) {
    	//	doPut(req, resp);   
	} else {
    		response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, "Unknown HTTP METHOD");
	}
   }
   
 
   public void doPost(HttpServletRequest request, HttpServletResponse response) 
		   throws ServletException, IOException { 
 
       context = request.getServletContext();

       response.setContentType("text/html");
       PrintWriter pwriter=response.getWriter();
       pwriter.print("<html>");
       pwriter.print("<body>");
       pwriter.print("<h1>Hi, I'm a Generic Servlet</h1>");
       pwriter.print("<p>I dispatched the request to the doPost() method</p>");
       pwriter.print("</body>");
       pwriter.print("</html>");
   } 

   public void destroy(){
       context.log("Destroyed");
   }
  
   public ServletConfig getServletConfig(){
       return config;
   }
  
   public String getServletInfo(){
       return "A Demo program written by ...";
   }
}
