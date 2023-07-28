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
 * Servlet implementation class BuyingServlet
 */
@WebServlet("/BuyingServlet")
public class BuyingServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		// ①お決まりで記述が必要なもの
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		// ②リクエスト情報の取り出し（必ずStringでしか取り出せない）
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String postno = request.getParameter("postno");
		String address = request.getParameter("address");
		String phoneno = request.getParameter("phoneno");
		String foodssname = request.getParameter("foodssname");
		String foodssprice = request.getParameter("foodssprice");

		String buyquantity = request.getParameter("buyquantity");
		String taxprice = request.getParameter("taxprice");
		String totalprice = request.getParameter("totalprice");

		String location = request.getParameter("location");
		int totalprice2 = Integer.valueOf(totalprice);
		int taxprice2 = Integer.valueOf(taxprice);


//		int foodprice = Integer.parseInt(request.getParameter("foodprice"));
		int deliveryfee;
//		String alarm = "Error:前のページに戻って、届く地域を選んでください";
		if (totalprice2 >2000) {
			deliveryfee=0;
		}
		else if (totalprice2 <2000 &&location.equals("1")){
			deliveryfee=340;
		} else if (totalprice2 <2000 &&location.equals("2")){
			deliveryfee=640;
		} else if (totalprice2 <2000 &&location.equals("3")){
			deliveryfee=430;

     	}  else if (totalprice2 <2000 &&location.equals("4")){
			deliveryfee=480;
		}  else if (totalprice2 <2000 &&location.equals("5")){
			deliveryfee=560;
		}   else if (totalprice2 <2000 &&location.equals("6")){
		deliveryfee=640;	}  
		else if (totalprice2 <2000 &&location.equals("7")){
				deliveryfee=720;
			}
	 else {
			deliveryfee=10000;
		} 

		int allprice;
allprice=deliveryfee+totalprice2;
		// ③メイン処理

		// ④JSPへ転送（必要ならスコープに情報いれる）
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("postno", postno);
		request.setAttribute("address", address);
		request.setAttribute("phoneno", phoneno);
		request.setAttribute("foodssname", foodssname);
		request.setAttribute("totalprice", totalprice);

		request.setAttribute("foodssprice", foodssprice);
		request.setAttribute("buyquantity", buyquantity);
		request.setAttribute("taxprice", taxprice);
		request.setAttribute("location", location);
		request.setAttribute("deliveryfee", deliveryfee);
		request.setAttribute("allprice", allprice);
		
		HttpSession session = request.getSession();
		account account = (account)session.getAttribute("account");
	    
		if(account != null) {
		    request.getRequestDispatcher("WEB-INF/buying.jsp?msg=logined").forward(request, response);;
			}
			else {
			    request.getRequestDispatcher("WEB-INF/buying.jsp?msg=notlogin").forward(request, response);
			} 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	}