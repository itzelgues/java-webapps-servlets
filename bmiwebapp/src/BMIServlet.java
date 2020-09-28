import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet; 

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "BMIServlet", urlPatterns = "/bmiServlet")
public class BMIServlet extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException {
 
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");
 
        double bmi = calculateBMI( Double.parseDouble(weight), 
                                   Double.parseDouble(height));
            
	response.setContentType("text/html");        
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<H1> Your Body Mass Index: </H1>");
	out.println("<H2>" +  bmi +  "</H2>");
	out.println("</body>");
	out.println("</html>");
    }
 
    private Double calculateBMI(Double weight, Double height) {
        return weight / (height * height);
    }
}

