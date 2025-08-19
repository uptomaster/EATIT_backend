package com.bapseguen.app.sellerMyPage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bapseguen.app.Result;

/**
 * Servlet implementation class sellerMyPageFrontController
 */
//@WebServlet("/sellerMyPageFrontController")
public class SellerMyPageFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerMyPageFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("sellerMyPageFrontController 진입 성공");
		System.out.println("현재 경로 : "+target);
		Result result = new Result();
		
		switch(target) {
		case "/sellerPage/foodSaleWrite.se":
			System.out.println("음식 판매 등록 요청");
			break;
		case "/sellerPage/":
		}
	}

}
