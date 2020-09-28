import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class LifeCycleServlet extends HttpServlet {
	private String output;

	// Initializing servelet
	public void init() throws ServletException {
		output = "Initialized";
	}

	// Requesting and printing the output
	public void doGet(HttpServletRequest req,
			  HttpServletResponse resp)
	throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println(output);
		out.println("Running");

		callDestroy(out);

	}

	public void callDestroy(PrintWriter pw) {
		pw.println("Destroying");

		destroy();
	}


	public void destroy() {
		System.out.println("destroy");
	}
}

