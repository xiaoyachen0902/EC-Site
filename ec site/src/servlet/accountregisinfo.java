package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class accountregisinfo
 */
@WebServlet("/accountregisinfo")
public class accountregisinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public accountregisinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	       
        String newid = request.getParameter("newid");
        String password = request.getParameter("password");
        String fullname = request.getParameter("fullname");
        String postalcode = request.getParameter("postalcode");
        String address = request.getParameter("address");
        String eMail = request.getParameter("eMail");
        String phoneNumber = request.getParameter("phoneNumber");
        String hantei = (String)request.getAttribute("hantei");
        
        
        HttpSession session = request.getSession();
		session.setAttribute("newid", newid);
		session.setAttribute("password", password);
		session.setAttribute("fullname", fullname);
		session.setAttribute("postalcode", postalcode);
		session.setAttribute("address", address);
		session.setAttribute("eMail", eMail);
		session.setAttribute("phoneNumber", phoneNumber);
		
		
		
		 request.getRequestDispatcher("WEB-INF/registerconfirm.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
