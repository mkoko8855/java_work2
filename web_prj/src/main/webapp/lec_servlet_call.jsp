<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- 전송방식 -> 겟호출연습 -->
<!--<a href="http://Localhost:8081/board_servlet_url">서블릿 GET 방식 호출</a>-->
<!-- 그러면 index.html 화면이 띄워진다! -->
<!-- 그러나 위처럼 호출 안하고 아래처럼 한다. -->
<a href="/board_servlet_url">서블릿 GET 방식 호출</a>


<br>


<!-- 포스트는 form태그를 알아야 한다. 이것으로만 전달 할 수 있다. 
그러나 form쓰고 겟방식으로 호춣해보자-->
<!-- form의 속성은 2개다 -> method방식이있다. -->
<form action="/board_servlet_url" method="get" >
	<input type="submit" value="서블릿 GET 방식 호출">
</form>




<br>



<!-- 전송방식 -> POST호출연습 -->
<form action="/board_servlet_url" method="post" >
	<input type="submit" value="서블릿 POST 방식 호출">
</form>





<br>





<form action="/board_servlet_url" method="post" >
	<input type="test"><br>
	<input type="password"><br>
	<input type="submit" value="서블릿 POST 방식 호출">
</form>







<br>


★★★★★★★★★★이 아래서부터 값 넣어보면서 연습★★★★★★★★★★<br>


<form action="/board_servlet_url" method="post" >
	<input name="userid" type="text"><br> <!-- name이름은 퍼블리셔가 아닌 개발자인 우리가 정한다. -->
	<input name="userpw" type="password"><br>
	
	
	

	
	<input name="gen" type="radio" value='m'>남 <!-- radio는 둘중하나 선택해야하니 name이름이 같아야 한다. -->
	<input name="gen" type="radio" value='f'>여 <br>
	
	

	
	<input name="habit" type="checkbox" value='mount'>등산
	<input name="habit" type="checkbox" value='fish'>낚시
	<input name="habit" type="checkbox" value='music'>음악
	<input name="habit" type="checkbox" value='art'>미술<br>



	<select name="subject">
		<option value='kor'>국어</option>
		<option value='eng'>영어</option>
		<option value='math'>수학</option>
	</select>
	
	<br>
	
	<input type="file" name="userfile"><br>
	
	
	
	<input type="hidden" name="ssn" value="12345"><br> <!-- hidden창은 화면에만 안보인다. 사용자한테 입력받지않는데 서버로 넘기고 싶다면? 게시판을 예로들면, seq가 해당된다.  -->
	
	
	
	<textarea name="contents" rows=3 cols=50></textarea><br>
	

	
	
	<input type="submit" value="서블릿 POST 방식 호출">
</form>



			<!-- 위를 작성하고 BoardSevlet클래스 가서
			
				 doPost메서드에 아래와 같이 적고 확인해보자.
			
				String vUserid = request.getParameter("userid");
				String vUserpw = request.getParameter("userpw");
				String vGen = request.getParameter("gen");
				String[] vHabit = request.getParameterValues("habit"); 
				String vSubject = request.getParameter("subject");
				String vUserfile = request.getParameter("userfile");
				String vSsn = request.getParameter("ssn");
				String vContents = request.getParameter("contents");

				System.out.println(vUserid);
				System.out.println(vUserpw);
				System.out.println(vGen);
				
				for(String vh : vHabit) { //배열은 이렇게 출력해야지.
					System.out.println(vh);
				}
				
				System.out.println(vSubject);
				System.out.println(vSsn);
				System.out.println(vContents);
			
			 -->


</body>
</html>