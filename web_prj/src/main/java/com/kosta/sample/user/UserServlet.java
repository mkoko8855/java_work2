package com.kosta.sample.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



@WebServlet("/UserServlet") //.JSP에서 정보가 이 서블릿으로 온다!
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    public UserServlet() {
        super();
    }
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		
		//페이지 구분을 위한 input type=hidden 값
		String pagecode = request.getParameter("pagecode");
		UserDAO dao = new UserDAO();
		
		// -------------------register --------------------
				if(pagecode.equals("P001")) {
					//seq - user_seq.nextval
					String userid  = request.getParameter("userid");
					String uname   = request.getParameter("uname");
					String email   = request.getParameter("email");
					String passwd  = request.getParameter("passwd");
					//regdate - sysdate
					
					UserVO uvo = new UserVO();
					uvo.setUserid(userid);
					uvo.setUname(uname);
					uvo.setEmail(email);
					uvo.setPasswd(passwd);
					
					int insertRows = dao.userInsert(uvo);
					if(insertRows == 1) {
						//회원가입 성공
						response.sendRedirect("index.jsp");
					} else {
						//회원가입 실패
						response.sendRedirect("500.html");
					}
				
				// -------------------login --------------------
			    } else if(pagecode.equals("P002")) {
			    	String userid = request.getParameter("userid");
			    	String passwd = request.getParameter("passwd");
			    	

				////boolean loginCheck = dao.userLogin(userid, passwd); 
				//dao에 있는 메서드명적었음
				//grade 추가 했으니 boolean이 아니라 UserVO로 받자

			    //boolean loginCheck = dao.userLogin(userid, passwd);
			    //if(loginCheck == true) {
			    	UserVO uvo = dao.userLogin(userid, passwd);

				//if(loginCheck == true) {} -> uvo에 loginCheck넣어서 써도되긴함 -> UserVO클래스가서 -> private boolean loginCheck; 만들면된다.
			    //if(uvo != null) {
			    	if(uvo.getLoginCheck()) {
						//로그인 성공
						//session.add("MYKEY_GRADE", grade);
						System.out.println("--------- 세션 할당 ------------" + uvo.getGrade());
						
						response.sendRedirect("index.jsp");
					} else {
						//로그인 실패
						response.sendRedirect("500.html");
					}
			    
			    // -------------------other --------------------
				} else {
					response.sendRedirect("500.html");
				}
				
				
				
			}

		}
