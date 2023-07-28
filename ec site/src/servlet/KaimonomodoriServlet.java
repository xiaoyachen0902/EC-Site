package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuyprocessServlet
 */
@WebServlet("/KaimonomodoriServlet")
public class KaimonomodoriServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {//①お決まりで記述が必要なもの
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	
	String modori = "modori";
	request.setAttribute("modori", modori);
	request.getRequestDispatcher("WEB-INF/buyprocess.jsp?msg=login").
	forward(request, response);
    }


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
}

}