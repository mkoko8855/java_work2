<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.kosta.boardtest.BoardVO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	$(function() {
		
	});
</script>

</head>
<body>
<!-- 
	JSTL(JSP Standard Tag Library) : JSP 표준라이브러리
	EL(Expression Language) : JSP 사용하는 스크립트릿 문법을 쉽게 하기 위한 표현식
	
	- JSP 내장객체 SCOPE : page > request > session > application
	- EL 내장객체 SCOPE : pageScope > requestScope > sessionScope > applicationScope
 -->





<%
//서블릿 코드는 이렇게 생김
//BoardVO bvo = new BoardVO();
//bvo.setRegid("kim");
//bvo.setTitle("이건제목");
//객체전달해야하니 포워딩해야한다. 포워딩은 리퀘스트다.
//request.setAttribute("KEY_BOARDVO", bvo);

//BoardVO bvo = (BoardVO)request.getAttribute("KEY_BOARDVO");
//out.println(bvo.getRegid() + "," + bvo.getTitle());
%>

<!-- EL 태그로는 다음과 같다. -->
<!-- ${requestScope.KEY_BOARDVO.regid} -->






<%
//서블릿코드를 꺼내보자
/*
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
		
		//객체전달해야하니 포워딩해야한다. 포워딩은 리퀘스트다.
		RequestDispatcher rd = request.getRequestDispatcher("lec_jstl.jsp");
		rd.forward(request, response);
		
	}
*/
//ArrayList<BoardVO> list = (ArrayList<BoardVO>)request.getAttribute("KEY_LISTVO");
//for(BoardVO bvo : list){
//	out.println(bvo.getTitle() + "," + bvo.getRegid) + "<br>");
//}
%>
<!-- 쉽게꺼내보자 -->
<!-- 키값 겟셋만 알면 뽑을 수 있다 -->
<!--
$ {requestScope.KEY_LISTVO[0]["regid"]}, ${requestScope.KEY_LISTVO[0]["title"]}<br>
$ {requestScope.KEY_LISTVO[1]["regid"]}, ${requestScope.KEY_LISTVO[1]["title"]}<br>
-->











<!-- 
        //이번에는 맵을 한번 담아보자
		HashMap<String, BoardVO> map = new HashMap<String, BoardVO>();
		BoardVO bvo = new BoardVO();
		bvo.setRegid("kim");
		bvo.setTitle("이건제목");
		map.put("map_key", bvo);
		request.setAttribute("KEY_MAPVO", map);
		
		//객체전달해야하니 포워딩해야한다. 포워딩은 리퀘스트다.
		RequestDispatcher rd = request.getRequestDispatcher("lec_jstl.jsp");
		rd.forward(request, response);
위를 꺼내보자
 -->
<%
//HashMap<String, BoardVO> map = (HashMap<String, BoardVO>)request.getAttribute("KEY_MAPVO");
//out.println(map.get("map_key").getRegid() + "," + map.get("map_key").getTitle());
%>

<!-- 바로 위를 EL로꺼내보라 앞은 스코프 붙인거, 안붙인거.  -->
<!--
${requestScope.KEY_MAPVO.map_key.regid}, ${KEY_MAPVO.map_key.title} 
-->









<!--
//이번에는 세션을 꺼내보자
HttpSession session = request.getSession();
session.setAttribute("SESS_ID", "kim"); //세션할당
session.setAttribute("SESS_GRADE", "gold"); //세션할당
//객체전달해야하니 포워딩해야한다. 포워딩은 리퀘스트다.
RequestDispatcher rd = request.getRequestDispatcher("lec_jstl.jsp");
rd.forward(request, response);
-->
<%
//String uid = (String)session.getAttribute("SESS_ID"); 
//out.print(uid);
%>
<!-- EL을 써보자 -->
<!-- $ {sessionScope.SESS_ID}-->
















<!-- 쿠키 꺼내보자 -->
<!--
//이번에는 쿠키! -> 쿠키는 기본생성자없음 -> 키와 밸류 쌍으로 만들어야함
Cookie ck = new Cookie("MY_COOKIE_UID", "lee");
Cookie ck2 = new Cookie("MY_COOKIE_GRADE", "lee");
ck.setMaxAge(100);
ck2.setMaxAge(100);
//응답에 실어주자
response.addCookie(ck);
response.addCookie(ck2);
		
		
//객체전달해야하니 포워딩해야한다. 포워딩은 리퀘스트다.
RequestDispatcher rd = request.getRequestDispatcher("lec_jstl.jsp");
rd.forward(request, response);
-->
<%
//Cookie[] cookies = request.getCookies(); //쿠키 여러개 꺼내는거임. 한두개아님.
//String myCookieValue = null; 
//if (cookies != null) { 
//	for (Cookie cookie : cookies) { 
//		out.println(cookie.getName() + "," + cookie.getValue() + "<br>");
//	} 
//} 
%>
<!-- EL태그로 쿠키를 꺼내보자 -->
<!--
${cookie.MY_COOKIE_UID.name}, ${cookie.MY_COOKIE_UID.value}
 -->











<!-- JSTL : if문, forEach -->
<%
String cval = "lee";
int num = 10;
if(cval.equals("lee") && num==10){
	out.println("ok<br>");
} else {
	out.println("fail<br>");
}
//지금까지 위 방식으로 사용했었다.
%>

<!-- 위를 JSTL로 바꿔보자 -> test에조건쓰자 -> eq는 == 이다. -->
<c:if test="${cookie.MY_COOKIE_UID.value eq lee}">
	ok lee
</c:if>














<c:choose>

	<c:when test="${userid} == 'hong'}">
		유저:홍
	</c:when>
	<c:when test="${userid == 'admin'}">
		어드민
	</c:when>
	<c:otherwise>
		손님
	</c:otherwise>
</c:choose>




<!-- for(int i=1; i<=10; i+=2) -->
<c:forEach var="myval" begin="1" end="10" step ="2" >
	출력 : ${myval}<br>
</c:forEach>






<!-- JstlServlet에서
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
이거 다시 열고 foreach를 이용해서 루프
 -->
 
<c:forEach items="${KEY_LISTVO}" var="mybvo"  varStatus="mysts">
	${mybvo.regid} , ${mybvo.title} - ${mysts.index} ${mysts.count}<br>
</c:forEach>











<c:if test="${not empty KEY_LISTVO}">
	<c:forEach items="${KEY_LISTVO}" var="mybvo" varStatus="mysts">
			${mybvo.regid} , ${mybvo.title} - ${mysts.index} ${mysts.count}<br>
	</c:forEach>
</c:if> 
<c:if test="${empty KEY_LISTVO}">
	데이터 없으니 관리자문의하세요. 이것은 ArrayList < BoardVO > list = null 인 상황입니다.
</c:if>








<c:forTokens items="123-456-789"  delims="-" var="myval">
       ${myval}  <br>
</c:forTokens>






<!-- ahref쓰자그냥..
<c:redirect udrl="index.jsp"
	
</c:redirect
 -->




<c:set var="mynum" value="123456789"/>
천단위콤마 : <fmt:formatNumber value="${mynum}" type="currency" currncySymbol="\\">
	
</fmt:formatNumber>









</body>
</html>