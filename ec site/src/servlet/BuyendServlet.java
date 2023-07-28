package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Logic.OrderLogic;
import dto.Order;
import dto.account;

@WebServlet("/BuyendServlet")
public class BuyendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyendServlet() {
        super();
    }
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
		
    	try {// ②リクエスト情報の取り出し（必ずStringでしか取り出せない）
		HttpSession session = request.getSession();

    	String address = request.getParameter("address");
		String foodssname = request.getParameter("foodssname");
		String allprice = request.getParameter("allprice");
		String foodssprice = request.getParameter("foodssprice");
		String buyquantity = request.getParameter("buyquantity");
		String deliveryfee = request.getParameter("deliveryfee");
		String neworderesid = UUID.randomUUID().toString();
//		String neworderesid = "12345";
		Date Orderdate = new Date();
		String userid = (String)session.getAttribute("userid");
		int allprice2 = Integer.valueOf(allprice);
		int buyquantity2 = Integer.valueOf(buyquantity);


		// ③メイン処理

		// ④JSPへ転送（必要ならスコープに情報いれる）
		request.setAttribute("address", address);
		request.setAttribute("foodssname", foodssname);
		request.setAttribute("allprice", allprice);
		request.setAttribute("foodssprice", foodssprice);
		request.setAttribute("buyquantity", buyquantity);
		request.setAttribute("deliveryfee", deliveryfee);
		request.setAttribute("Orderdate", Orderdate);
		request.setAttribute("neworderesid", neworderesid);

    	
    	OrderLogic logic = new OrderLogic();
       
 		Order neworederes = logic.process(neworderesid, userid, Orderdate, allprice2,buyquantity2,foodssprice,deliveryfee,foodssname,address);
 		session.setAttribute("neworederes", neworederes);
		account account = (account)session.getAttribute("account");

 		if(account != null) {
		    request.getRequestDispatcher("WEB-INF/buyend.jsp?msg=logined").forward(request, response);;
			}
			else {
			    request.getRequestDispatcher("WEB-INF/buyend.jsp?msg=notlogin").forward(request, response);
			} 
 		
 			
        } catch (SQLException e) {
            throw new ServletException(e);
        }
       
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}