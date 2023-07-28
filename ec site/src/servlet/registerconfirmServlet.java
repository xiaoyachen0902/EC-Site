package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Logic.newuserLogic;
import dto.account;

/**
 * Servlet implementation class registerconfirmServlet
 */
@WebServlet("/registerconfirmServlet")
public class registerconfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerconfirmServlet() {
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

        
        
        HttpSession session = request.getSession();
		session.setAttribute("newid", newid);
		session.setAttribute("password", password);
		session.setAttribute("fullname", fullname);
		session.setAttribute("postalcode", postalcode);
		session.setAttribute("address", address);
		session.setAttribute("eMail", eMail);
		session.setAttribute("phoneNumber", phoneNumber);
		
       newuserLogic logic = new newuserLogic();
       try {
			account newacounts = logic.process(newid, password, fullname, eMail, postalcode, address, phoneNumber);
			
			
				session.setAttribute("newacounts", newacounts);
				
				
				request.getRequestDispatcher("WEB-INF/registerend.jsp").forward(request,response);
				
			
			
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
            
        
     	
				
			
			
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
