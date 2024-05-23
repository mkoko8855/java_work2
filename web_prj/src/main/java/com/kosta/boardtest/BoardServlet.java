package com.kosta.boardtest;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//1번 : 주소가 board_servlet_url이다. 웹에서 이걸치면 불려져야 한다. -> 근데 웹서버가 있어야 한다. -> 일단 아파치 톰캣 9점대를 IT파일가서 풀어주자.
//2번 : web_prj 우클릭 -> Run AS -> Run on Server -> .....-> 포트번호 8081


//Serializable(직렬화)     : 인코딩(객체를 바이트로 바꾸는것)하는 것.
//DeSerializable(역직렬화)  : 디코딩(바이트를 다시 객체로 바꾸는것)하는 것.
	

//public abstract class HttpServlet {}

//다형성관계
//public interface ServletContext {
//	public abstract void log(ServletConfiglmpl sc); -> 부모를 가져다가 파라미터 타입으로 씀
//}









@WebServlet("/BoardServlet") 
public class BoardServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	
	
    public BoardServlet() {
    }

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pagecode = request.getParameter("pagecode");
		BoardDAO dao = new BoardDAO();
		
		//게시물 목록보기
		if(pagecode.equals("B001")) {
			ArrayList<BoardVO> list = dao.boardSelect(); //list를 이제 tables.jsp 에 넘겨줘야지
			request.setAttribute("KEY_BOARDLIST", list); // -> 해당 요청에 list를 담고
			//HttpSession session = request.getSession();
			//jsp와 연결고리인 rd를 이용하여
			//forward -> request랑 response인 2개 갖고있는걸 .jsp한테 다 줄꺼야 
			RequestDispatcher rd = request.getRequestDispatcher("tables.jsp");
			rd.forward(request, response); 
			
			
			//게시물 상세보기
		}else if(pagecode.equals("B002")) {
			int seq = Integer.parseInt(request.getParameter("seq")); //seq와 와야 selectone가능!!!!!
			BoardVO bvo = dao.boardSelectOne(seq);
			
			request.setAttribute("KEY_BOARDVO", bvo);
			RequestDispatcher rd = request.getRequestDispatcher("tables_detail.jsp");
			rd.forward(request, response); 
		}else {
			response.sendRedirect("500.html");
		}
		
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().append("GET");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//board 목록 DB에서 꺼내기
		

		
		//      콘솔창에 게시판내용이 잘 들어오는지 확인용
//		System.out.println("총 :" + list.size());
//		for(BoardVO bvo : list) {
//		int seq = bvo.getSeq();
//		String title = bvo.getTitle();
//		String contents = bvo.getContents();
//		String regid = bvo.getRegid();
//		String regdate = bvo.getRegdate();
//		System.out.println(seq + "\t" + title + "\t" + contents + "\t" + regid + "/t" + regdate);
//		}
		
		
		
		
		//list를 넘겨주자 (중요)
		//어캐넘길껴
		//단순 글자 전용은 아래와 같이 했다.
		//response.sendRedirect("tables.jsp?UID=kim"); 이런식으로했는데
		
		//그럼 객체 전송으로 하자
		//요청자한테 무슨키의 무슨값인지 요청해
		
		
		
		/*
		 
		  	page scope : 가져온 값을 어느 범위까지 공유해서 사용할것인가?
		  	page < request < session < application
		  	
		  	session.setAttribute 던가
		  	request.setAttribute 던가..
		  
		*/
		
		System.out.println("request method : GET");
		//response.sendRedirect("index.html");
		
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
	}

}
