package com.kosta.boardtest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1번 : 주소가 board_servlet_url이다. 웹에서 이걸치면 불려져야 한다. -> 근데 웹서버가 있어야 한다. -> 일단 아파치 톰캣 9점대를 IT파일가서 풀어주자.
//2번 : web_prj 우클릭 -> Run AS -> Run on Server -> .....-> 포트번호 8081

@WebServlet("/board_servlet_url") 
public class BoardServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	
	
    public BoardServlet() {
    }

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("index.html");
	
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
