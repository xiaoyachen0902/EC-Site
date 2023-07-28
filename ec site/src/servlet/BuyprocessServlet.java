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
 * Servlet implementation class BuyprocessServlet
 */
@WebServlet("/BuyprocessServlet")
public class BuyprocessServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {//①お決まりで記述が必要なもの
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	
	// ②リクエスト情報の取り出し（必ずStringでしか取り出せない）
	String foodsname = request.getParameter("foodsname");
//	String foodprice = request.getParameter("foodprice");

    int foodsprice = Integer.parseInt(request.getParameter("foodsprice"));
	String buyquantity = request.getParameter("buyquantity");
	int buyquantity2 = Integer.valueOf(buyquantity);
	int a = foodsprice;
	int b = buyquantity2;
	double totalprice = a*b+a*b*0.08;
	double taxprice = a*b*0.08;
	int totalprice1 =(int)(totalprice);
	int taxprice1=(int)(taxprice);


	
	

	// ③メイン処理
	HttpSession session = request.getSession();
	// ④JSPへ転送（必要ならスコープに情報いれる）
	session.setAttribute("foodsname", foodsname);
	session.setAttribute("foodsprice", foodsprice);
	session.setAttribute("buyquantity", buyquantity);
	session.setAttribute("totalprice", totalprice);
	session.setAttribute("taxprice", taxprice);
	session.setAttribute("totalprice1", totalprice1);

	session.setAttribute("taxprice1", taxprice1);
	

	
	


	
    account account = (account)session.getAttribute("account");
    
	if(account != null) {
		
	    request.getRequestDispatcher("WEB-INF/buyprocess.jsp?msg=login").forward(request, response);
		}
		else {
		    request.getRequestDispatcher("WEB-INF/buyprocess.jsp?msg=notlogin").forward(request, response);
		} 
//	if(account == null) {
//    	request.getRequestDispatcher("WEB-INF/buyprocess.jsp?msg=notlogin").forward(request,response);
//    }else {
//    	
//	
//	request.getRequestDispatcher("WEB-INF/buyprocess.jsp?msg=login").
//	forward(request, response);
//    }
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
}

}