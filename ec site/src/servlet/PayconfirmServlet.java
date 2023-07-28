package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.account;

@WebServlet("/PayconfirmServlet")
public class PayconfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   	//①お決まりで記述が必要なもの
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
		
		// ②リクエスト情報の取り出し（必ずStringでしか取り出せない）
    	String address = request.getParameter("address");
		String foodssname = request.getParameter("foodssname");
		String allprice = request.getParameter("allprice");
		String foodssprice = request.getParameter("foodssprice");
		String buyquantity = request.getParameter("buyquantity");
		String deliveryfee = request.getParameter("deliveryfee");

	
		// ③メイン処理
		request.setAttribute("address", address);
		request.setAttribute("foodssname", foodssname);
		request.setAttribute("allprice", allprice);
		request.setAttribute("foodssprice", foodssprice);
		request.setAttribute("buyquantity", buyquantity);
		request.setAttribute("deliveryfee", deliveryfee);

		HttpSession session = request.getSession();
		account account = (account)session.getAttribute("account");
	    
		if(account != null) {
		    request.getRequestDispatcher("WEB-INF/payconfirm.jsp?msg=logined").forward(request, response);;
			}
			else {
			    request.getRequestDispatcher("WEB-INF/payconfirm.jsp?msg=notlogin").forward(request, response);
			} 
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}