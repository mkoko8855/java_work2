package com.kosta.sample.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/char")
public class CharTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CharTestServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doget()이나 dopost 메서드 상단에 아래 두줄 삽입하자!! -> 깨지면 스프링들어가기전까지 2줄을 매번 넣어줘야함
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		// 위 2줄을 작성한다면 한글이 안깨짐, 아래다두면안된다 메서드최상단에 바로 넣어야 함
		// 그러나 위 두개 쓰기싫으면 Servers에 server.xml에 source누르고 포트번호 옆에 URIEncoding="UTF-8" 넣자.
		// 근데 실패..

		// 그래서 web.xml에 가서
		/*
		 * <!-- A filter that sets character encoding that is used to decode --> <!--
		 * parameters in a POST request -->
		 * 
		 * <filter> <filter-name>setCharacterEncodingFilter</filter-name>
		 * <filter-class>org.apache.catalina.filters.SetCharacterEncodingFilter</filter-
		 * class> <init-param> <param-name>encoding</param-name>
		 * <param-value>UTF-8</param-value> </init-param> </filter>
		 * 
		 * <!-- The mapping for the Set Character Encoding Filter -->
		 * 
		 * <filter-mapping> <filter-name>setCharacterEncodingFilter</filter-name>
		 * <url-pattern>/*</url-pattern> </filter-mapping>
		 * 
		 * 
		 * 위 코드들을 주석풀어주고 저장.
		 */
		response.getWriter().append("Served at: ㅋㅋ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		doGet(request, response);
	}

}
