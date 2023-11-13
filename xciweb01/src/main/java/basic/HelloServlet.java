package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloServlet", loadOnStartup = 10)
public class HelloServlet extends HttpServlet {
	
	public HelloServlet() {
        System.out.println("HellloServlet 생성자 수행");
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("HelloServlet init() 수행");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("helloServlet service() 수행");
		response.setContentType("text/html;charset=UTF-8"); // meta 데이터 정보 인코딩 정	보
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>first servlet~!</title></head>");
		out.println("<body><h1>Hello Servlet~</h1></body>");
		out.println("</html>");
		out.flush();
		out.close();
	}
}
