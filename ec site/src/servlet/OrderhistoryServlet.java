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

import Logic.ordersselectLogic;
import dto.Order;
import dto.account;


@WebServlet("/OrderhistoryServlet")
public class OrderhistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   	//①お決まりで記述が必要なもの
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	try {
		// ②リクエスト情報の取り出し（必ずStringでしか取り出せない）
		String foodssname = request.getParameter("foodssname");
		String totalprice = request.getParameter("totalprice");
		String foodssprice = request.getParameter("foodssprice");
		String buyquantity = request.getParameter("buyquantity");
		String allprice = request.getParameter("allprice");
		String deliveryfee = request.getParameter("deliveryfee");
		String Orderdate = request.getParameter("Orderdate");
		String neworderesid = request.getParameter("neworderesid");
        String strDate = request.getParameter("strDate");
        String userid = request.getParameter("userid");

    	String address = request.getParameter("address");

		request.setAttribute("address", address);


		// ③メイン処理
 
		// ④JSPへ転送（必要ならスコープに情報いれる）
				
		request.setAttribute("foodssname", foodssname);
		request.setAttribute("totalprice", totalprice);
		request.setAttribute("foodssprice", foodssprice);
		request.setAttribute("buyquantity", buyquantity);
		request.setAttribute("allprice", allprice);
		request.setAttribute("deliveryfee", deliveryfee);
		request.setAttribute("Orderdate", Orderdate);
		request.setAttribute("neworderesid", neworderesid);
		request.setAttribute("strDate", strDate);

		request.setAttribute("userid", userid);

		
		
		HttpSession session = request.getSession();
		account account = (account)session.getAttribute("account");
		
		ordersselectLogic Logic = new ordersselectLogic();
		List<Order> orderlists = Logic.process(account.getAccountid());
		session.setAttribute("orderlists", orderlists);
		
		if(account != null) {
		    request.getRequestDispatcher("WEB-INF/orderhistory.jsp?msg=logined").forward(request, response);;
			}
		else {
			request.getRequestDispatcher("WEB-INF/orderhistory.jsp?msg=notlogin").forward(request, response);
			} 
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
   
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
