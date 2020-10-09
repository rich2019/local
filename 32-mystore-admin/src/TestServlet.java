

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return "add.jsp";
	}
}
