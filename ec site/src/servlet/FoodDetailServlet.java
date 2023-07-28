package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Logic.FoodDetailLogic;
import dto.account;
import dto.food;

@WebServlet("/FoodDetailServlet")
public class FoodDetailServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ①文字化け防止
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UYF-8");
		
		// ②リクエスト情報の取り出し
		String foodid = request.getParameter("foodid");
		
		try {
			// ③メイン処理
			FoodDetailLogic fdlogic = new FoodDetailLogic();
			food foodsdetail = fdlogic.process(foodid);
			
			// ④JSPへ転送
			request.setAttribute("foodsdetail", foodsdetail);
			
			HttpSession session = request.getSession();

		    account account = (account)session.getAttribute("account");

			if(account != null) {
		    request.getRequestDispatcher("fooddetail.jsp?msg=logined").forward(request, response);;
			}
			else {
			    request.getRequestDispatcher("fooddetail.jsp?msg=notlogin").forward(request, response);
			} 
		
				
			
		} catch (SQLException e) {
			throw new ServletException(e);
		}
		
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
