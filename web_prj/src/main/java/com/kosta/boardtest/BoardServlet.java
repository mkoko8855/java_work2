package com.kosta.boardtest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1번 : 주소가 board_servlet_url이다. 웹에서 이걸치면 불려져야 한다. -> 근데 웹서버가 있어야 한다. -> 일단 아파치 톰캣 9점대를 IT파일가서 풀어주자.
//2번 : web_prj 우클릭 -> Run AS -> Run on Server -> .....-> 포트번호 8081


//Serializable(직렬화)     : 인코딩(객체를 바이트로 바꾸는것)하는 것.
//DeSerializable(역직렬화)  : 디코딩(바이트를 다시 객체로 바꾸는것)하는 것.
	

//public abstract class HttpServlet {}

//다형성관계
//public interface ServletContext {
//	public abstract void log(ServletConfiglmpl sc); -> 부모를 가져다가 파라미터 타입으로 씀
//}









@WebServlet("/board_servlet_url") 
public class BoardServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	
	
    public BoardServlet() {
    }

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("GET");
		System.out.println("request method : GET");
		response.sendRedirect("index.html");
	
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		response.getWriter().append("POST");

		
		//lec_servlet_call에서 작성했던 name값들을 파라미터값으로 적으면된다.
		//무조건String으로받자. 숫자로받을꺼면 캐스팅해야됨.
		String vUserid = request.getParameter("userid");
		String vUserpw = request.getParameter("userpw");
		String vGen = request.getParameter("gen");
		String[] vHabit = request.getParameterValues("habit"); //라디오박스가 여러개잖아. 배열로.
		String vSubject = request.getParameter("subject");
		String vUserfile = request.getParameter("userfile");
		String vSsn = request.getParameter("ssn");
		String vContents = request.getParameter("contents");
		
		//위는 하나씩 담았는데, 변수 하나 하나 담지말고 한번에 담으려면?
		//VO에 담아야한다.
		//UserVO로 set하면 받을 수 있다.
		
		
		
		
		System.out.println(vUserid);
		System.out.println(vUserpw);
		System.out.println(vGen);
		
		for(String vh : vHabit) { //배열은 이렇게 출력해야지.
			System.out.println(vh);
		}
		
		System.out.println(vSubject);
		System.out.println(vSsn);
		System.out.println(vContents);
		
		
		System.out.println("request method : POST");
	}

}
