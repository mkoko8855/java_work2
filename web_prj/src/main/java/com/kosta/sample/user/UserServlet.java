package com.kosta.sample.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;



@WebServlet("/UserServlet") //.JSP에서 정보가 이 서블릿으로 온다!
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    public UserServlet() {
        super();
    }
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//로그아웃처리
		HttpSession session = request.getSession(); //세션꺼내야지
		
		//session.removeAttribute("KEY_SESS_USERID");
		//session.removeAttribute("KEY_SESS_UNAME");
		//session.removeAttribute("KEY_SESS_GRADE");
		
		//또는 한번에 지워
		session.invalidate();
		
		//그래도 확실히 지운다면 -> 세션의 유효타임이 0초이다
		//session.setMaxInactiveInterval(0);
		response.sendRedirect("index.jsp");
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		
		//페이지 구분을 위한 input type=hidden 값
		String pagecode = request.getParameter("pagecode"); //왜 페이지코드가먼저들어와? -> register와 로그인을 동시처리해줘야한다. -> 두포스트 하나로 나눠서쓰고있따 -> 그래서 나눌수밖에없다.
		UserDAO dao = new UserDAO();
		
		// -------------------register --------------------
				if(pagecode.equals("P001")) { //001이면 DAO의 userInsert문 시작 -> DAO는 uvo를 달라고 하고있다
					//seq - user_seq.nextval
					
					
					String userid  = request.getParameter("userid");
					String uname   = request.getParameter("uname");
					String email   = request.getParameter("email");
					String passwd  = request.getParameter("passwd");
					//regdate - sysdate
					//위 4줄은 register.jsp의 name값들이다!!!!!
					
					
					
					//uvo로 담은것들을 넘길거야
					UserVO uvo = new UserVO();
					uvo.setUserid(userid);
					uvo.setUname(uname);
					uvo.setEmail(email);
					uvo.setPasswd(passwd);
					
					int insertRows = dao.userInsert(uvo); // /UserServlet을 호출하는 것을 register.jsp에 타이핑해야 호출이되겠지 -> 아래 if절의 회원가입 성공과 실패를 가르기 위해 이 한 줄을 사용한 것이다.
					//바로 위1줄코드 의미가 아래와같다.
					/*
					    UserDAO의
					 	String sql = "insert into users values(users_seq.nextval,?,?,?,?,sysdate,'u')";
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, uvo.getUserid());
						pstmt.setString(2, uvo.getUname());
						pstmt.setString(3, uvo.getEmail());
						pstmt.setString(4, uvo.getPasswd());
						insertRows =  pstmt.executeUpdate(); 
					 
					*/
					
					
					if(insertRows == 1) {
						//회원가입 성공
						response.sendRedirect("index.jsp");
					} else {
						//회원가입 실패
						response.sendRedirect("500.html");
					}
				
				// -------------------login --------------------
			    } else if(pagecode.equals("P002")) { //login.jsp
			    	
			    	//겟파라미터로 꺼내고 시작 -> 근데 서블릿코드를봤을때 request.getParameter면 어디에서 여기로 들어오는 것이다. 즉, 여기가 진입점이 아니다.
			    	String userid = request.getParameter("userid");
			    	String passwd = request.getParameter("passwd");
			    	//위를 DB에다 뭘 할꺼니, UserDAO가보자
			    	//위 2줄이 userDAO의 userLogin메서드의 파라미터값으로 넘어간다.
			    	//그리고 sql문으로 ? ?이 시작되고, if(rs.next(){절이 핵심라인이 되겠다.
			    	/*
			    	  uvo.setUserid(rs.getString("userid"));
			    	  uvo.setUserid(rs.getString("userid"));
			    	  uvo.setUserid(rs.getString("userid"));
			    	  이런 것들이 DB에서 꺼내는 것이다.
			    	  근데왜 uvo에담아? userLogin메서드는 UserVO니까.
			    	  
			    	  호출은 누가해?
			    	  여기 유저서블릿 아래로 내려가면
			    	  UserVO uvo = dao.userLogin(userid, passwd);가 있다.
			    	  userLogin메서드는 return uvo; 라고 했으니, uvo가 바로
			    	  아래에 있는
			    	  UserVO uvo = dao.userLogin(userid, passwd); 이줄이다.
			    	  
			    	  그리고 아래 진행..
			    	 */
			    	
			    	
			    	
			    	
			    	

				////boolean loginCheck = dao.userLogin(userid, passwd); 
				//dao에 있는 메서드명적었음
				//grade 추가 했으니 boolean이 아니라 UserVO로 받자

			    //boolean loginCheck = dao.userLogin(userid, passwd);
			    //if(loginCheck == true) {
			    	UserVO uvo = dao.userLogin(userid, passwd);

			    	
			    	
			    	
			    	
				//if(loginCheck == true) {} -> uvo에 loginCheck넣어서 써도되긴함 -> UserVO클래스가서 -> private boolean loginCheck; 만들면된다.
			    if(uvo != null) {
			    	//if(uvo.getLoginCheck()) {
			    		
			    		/*
			    		 
			    		  if(rs.next)){
			    		  	uvo = new UserVO();
			    		  	uvo.setUserid(rs.getString("userid"));
			    		  	uvo.setUserid(rs.getString("userid"));
			    		  	uvo.setUserid(rs.getString("userid"));
							uvo.setLoginCheck(true); 이런식으로도 가능.
			    		  }
			    		  
			    		 */
			    		
			    		
			    		
						//로그인 성공
						//session.add("MYKEY_GRADE", grade);
						System.out.println("--------- 세션 할당 ------------" + uvo.getGrade());
						//세션 첫시작
						HttpSession session = request.getSession(); 
						//이제 할당해줘야지
						session.setAttribute("KEY_SESS_USERID", uvo.getUserid());
						session.setAttribute("KEY_SESS_UNAME", uvo.getUname());
						session.setAttribute("KEY_SESS_GRADE", uvo.getGrade());
						//꺼낼꺼면 set자리를 get으로바꾸자
						//아무튼, 셋했으니 어디로갈까
						//index.jsp로가자
						
						
						
						
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
