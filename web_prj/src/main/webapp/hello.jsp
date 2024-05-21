<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!-- hello.jsp는 WAS의 servlet container에 의해 서블릿(hello_jsp.java) 으로 변환된다. -->
<!-- 위에 대한 위치는 다음과 같다 -> C:\IT\workspace_java\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\ROOT\org\apache\jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<% for(int i=1; i<=5; i++){ %>
	 <h2>이클립스 내부에서 html 문서 작성하기</h2>
	 <p> 하이요 <br> 지금은 html 문서를 작성 중입니다. </p>
	<% } %>


	<%
	for(int i=0; i<2; i++){
		out.println(i); //servlet의 jsp writer 내장객체 -> 메모리에 알아서 올라오기 떄문에 new안써도 됨 -> 화면에출력
		System.out.println(i); //콘솔창에 출력
	}
	%>


</body>
</html>