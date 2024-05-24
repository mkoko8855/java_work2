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
		
		String pagecode = request.getParameter("pagecode"); //pagecode -> 001, 002 꺼낼꺼야. request에서.
		BoardDAO dao = new BoardDAO();
		
		//게시물 목록보기
		if(pagecode.equals("B001")) { //-> 목록보기와 상세보기로 나눠져있기에 B001과 B002로나눔
		
			ArrayList<BoardVO> list = dao.boardSelect(); //list를 이제 tables.jsp 에 넘겨줘야지 -> 이 줄은 BoardDAO의 BoardSelect 메서드 호출해서 리턴받은걸 setAttribute한다
			request.setAttribute("KEY_BOARDLIST", list); // -> 개체를 넘기는거는 키값정하고 디스패쳐 이용하여 포워딩한다 -> 리퀘스트에 set했고, 그걸 tables.jsp에게 보냄 -> 즉, 해당 요청에 list를 포워딩을 통해 담을 것이다.
			
			//HttpSession session = request.getSession();
			//jsp와 연결고리인 rd를 이용하여
			//forward -> request랑 response인 2개 갖고있는걸 .jsp한테 다 줄꺼야 
			RequestDispatcher rd = request.getRequestDispatcher("tables.jsp");
			rd.forward(request, response); 
			//즉, reqeust를 이용해서 디스패쳐를 꺼냈고,
			//그 requestDispatcher를 통해 포워딩했다.
			//tables.jsp가보자
			
			
			
			
			
			//게시물 상세보기
		}else if(pagecode.equals("B002")) {
			int seq = Integer.parseInt(request.getParameter("seq")); //seq와 와야 selectone가능!!!!! -> 겟파라미터는 다 String인데 우린 seq를 받으니 int타입으로 형변환을 해야한다. wrapper가 wrapper를 캐스팅 할 수 있으니. -> 이 줄이 핵심 코드가 되겠다.
			BoardVO bvo = dao.boardSelectOne(seq); //서블릿에 던져주고
			
			request.setAttribute("KEY_BOARDVO", bvo); //DAO의 메서드가 return으로 bvo가 올 것이다.
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
		String pagecode = request.getParameter("pagecode");
		
		if(pagecode.equals("B003")) {
			System.out.println("수정");
			System.out.println(request.getParameter("seq"));
			System.out.println(request.getParameter("regid"));
			System.out.println(request.getParameter("regdate"));
			System.out.println(request.getParameter("title"));
			System.out.println(request.getParameter("contents"));
		} else if(pagecode.equals("B004")) {
			System.out.println("삭제");
		}
		
		


		    
		
		
		
		
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
	}

}
