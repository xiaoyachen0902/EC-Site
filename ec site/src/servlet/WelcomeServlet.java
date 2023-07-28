package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Logic.AccountLogic;
import dto.account;

/**
 * Servlet implementation class loginconfirm
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    try {    
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
		session.setAttribute("userid", userid);
		
		
       
            // ③メイン処理
            AccountLogic logic = new AccountLogic();
            account account = logic.process(userid);
            session.setAttribute("account", account);
            String foodsname = (String)session.getAttribute("foodsname");
//            String truePassword = account.getAccountpw();
//            String trueID= account.getAccountid();
            
          if(account == null)  {
        	  
        	  response.sendRedirect("LoginServlet?msg=notexist");
            } else if (userid.equals(account.getAccountid()) && password.equals(account.getAccountpw())) {

        		
            	if(foodsname == null) {
            	request.getRequestDispatcher("WEB-INF/welcome.jsp").forward(request,response);
            	}else {
            		request.getRequestDispatcher("WEB-INF/welcome.jsp?foodsname=ari").forward(request,response);
            	
            	}
				
			} 
			
		else {
			
			response.sendRedirect("LoginServlet?msg=invalid");

			}
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
