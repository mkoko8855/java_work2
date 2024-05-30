package com.kosta.sample.jstl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kosta.boardtest.BoardVO;

@WebServlet("/JstlServlet")
public class JstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JstlServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
	
		
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		BoardVO bvo = new BoardVO();
		bvo.setRegid("kim");
		bvo.setTitle("이건제목");
		list.add(bvo);
		bvo = new BoardVO();
		bvo.setRegid("kim2");
		bvo.setTitle("이건제목2");
		list.add(bvo);
		request.setAttribute("KEY_LISTVO", list);
		
		
		
		//이번에는 맵을 한번 담아보자
//		HashMap<String, BoardVO> map = new HashMap<String, BoardVO>();
//		BoardVO bvo = new BoardVO();
//		bvo.setRegid("kim");
//		bvo.setTitle("이건제목");
//		map.put("map_key", bvo);
//		request.setAttribute("KEY_MAPVO", map);
		
		
		
		
		
		//이번에는 세션을 꺼내보자
//		HttpSession session = request.getSession();
//		session.setAttribute("SESS_ID", "kim"); //세션할당
//		session.setAttribute("SESS_GRADE", "gold"); //세션할당
		
		
		
		
		
		
		
		
		//이번에는 쿠키! -> 쿠키는 기본생성자없음 -> 키와 밸류 쌍으로 만들어야함
		Cookie ck = new Cookie("MY_COOKIE_UID", "lee");
		ck.setMaxAge(100);
		//응답에 실어주자
		response.addCookie(ck);
		
		
		//객체전달해야하니 포워딩해야한다. 포워딩은 리퀘스트다.
		RequestDispatcher rd = request.getRequestDispatcher("lec_jstl.jsp");
		rd.forward(request, response);
		
	}

	
	
	
	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
