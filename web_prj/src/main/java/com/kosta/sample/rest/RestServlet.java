package com.kosta.sample.rest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RestServlet")
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RestServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		
		String searchGubun = request.getParameter("searchGubun");
		String searchStr   = request.getParameter("searchStr");
		System.out.println(searchGubun + "," + searchStr);
		//일반적으로 응답은 서버에서 오는 응답인 dataType(xml 또는 json..등등)이 될수도있는데,
		//그 타입이 뭐냐나는건 알아서 정해준다 했다.
		//가라 는게 아니라 데이터를 보내라는 것이다.
		PrintWriter out = response.getWriter(); //리다이렉트 포워드처럼 어디로 가라 가 아니라, 응답을 주라고 했다.
		out.println("이건 서버가 보내는 메시지");
		
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
