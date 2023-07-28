package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.account;


@WebServlet("/FoodNologinServlet")
public class FoodNologinServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ①文字化け防止
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// ②リクエスト情報の取り出し
		
			// ③メイン処理
	
			
		HttpSession session = request.getSession();
	    account account = (account)session.getAttribute("account");
	    
	    
		    request.getRequestDispatcher("foodresearch.jsp?msg=notlogin").forward(request, response);
		
		}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
