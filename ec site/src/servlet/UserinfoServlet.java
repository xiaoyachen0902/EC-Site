package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.account;

/**
 * Servlet implementation class loginconfirm
 */
@WebServlet("/UserinfoServlet")
public class UserinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    
	    
//            String truePassword = account.getAccountpw();
//            String trueID= account.getAccountid();
            
         HttpSession session = request.getSession();
        	 account account = (account) session.getAttribute("account");
        	 if(account == null) {
        		 request.getRequestDispatcher("WEB-INF/userinfo.jsp?msg=sippai").forward(request,response);
        	 }else {
        	 request.setAttribute("account", account);
            	request.getRequestDispatcher("WEB-INF/userinfo.jsp?msg=seikou").forward(request,response);
        	 }
       
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
