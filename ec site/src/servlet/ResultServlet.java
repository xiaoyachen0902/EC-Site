package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Logic.FoodListLogic;
import dto.account;
import dto.food;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// ①文字化け防止
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
	
	// ②リクエスト情報の取り出し
	String nameLike = request.getParameter("name_like");
	String category = request.getParameter("category");
	HttpSession session = request.getSession();

	try {
	if(category.equals("all")) {
		FoodListLogic fllogic = new FoodListLogic();
		List<food> foodlists = fllogic.process(nameLike);
		session.setAttribute("foodlist", foodlists);
	}
		
//			if(nameLike == null||category.equals("all")) {
//				nameLike = ""; 
//				FoodListLogic fllogic = new FoodListLogic();
//				List<food> foodlists = fllogic.process(nameLike);
//				session.setAttribute("foodlist", foodlists);		
//			} 
			// ③メイン処理
//			FoodListLogic fllogic = new FoodListLogic();
//			List<food> foodlist = fllogic.process(nameLike);
			else if (category.equals("C00001")&&nameLike!=null||category.equals("C00002")&&nameLike!=null||category.equals("C00003")&&nameLike!=null){
				FoodListLogic logic = new FoodListLogic();
				List<food> foodlists = logic.process3(nameLike,category);
				session.setAttribute("foodlist", foodlists);		

			}
			else {
				FoodListLogic fllogic = new FoodListLogic();
				List<food> foodlists = fllogic.process2(category);
				session.setAttribute("foodlist", foodlists);
			}


		   
			account account = (account)session.getAttribute("account");	
		    if(account != null) {
				request.getRequestDispatcher("result.jsp?msg=logined").
					forward(request, response);
		    }else {
			    request.getRequestDispatcher("result.jsp?msg=notlogin").forward(request, response);
			} 
//			request.getRequestDispatcher("result.jsp").
//				forward(request,response);
		
		} catch (SQLException e) {
		throw new ServletException(e);
		}
	}
		
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}