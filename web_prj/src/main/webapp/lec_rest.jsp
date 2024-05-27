<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 

	 AJAX란?
	 스크립트에서 비동기 통신을 위한 기술이다.
	 : JSON/XML/TEXT/..등의 데이터표기로 데이터를 송수신한다.
	 주로 JSON을 사용한다.
	
	 REST란?
	 웹 서비스를 위한 분산 시스템 아키텍쳐 이다.
	 http 프로토콜을 사용하며, 데이터 포맷은 일반적으로 JSON이나 XML을 주로 사용한다.
	 데이터나 어떤 컨텐츠서비스를 제공해주는 쪽을 프로바이더(서버) 라고 하는데,
	 프로바이더가 정한 규칙에 맞게 요청을 해야 응답을 받을 수 있다.
	 -> 개인정보 데이터 접근을 위해서는 토근(OAuth2)이용
	 
	
	 AJAX표현법은 다음과 같다
	 $.ajax( url [, settings ] );  
	 
	 비동기 통신이니 -> url을 String으로 설정해야한다. (/BoardServlet같은)
	 
	 
	 
	 
	 $.ajax({
	 	
	 	key : val,
	 	key : val 
	 	의 형식들은 아래와 같다. 즉, AJAX문법이다.
	 
	 });
	 
	 
	 $.ajax({ 
	 	mathod : "GET",   -> 기본값은 GET이다.
	 
	 	url : "BoardServlet?pagecode=B001", 이런것이다.
	 
	 	async : false,  비동기할꺼말꺼 -> 당연히 true니 안써도됨.
	 	
	 	beforeSend : function(){}, 보내기전에 해야할것
	 	
	 	complete : function(){}, 가기전에할일, 갔다와서할일
	 	
	 	contentType : "application/x-www-form-urlencoded; charset=UTF-8",    즉, 보낼 데이터 타입이 뭐냐? -> 기본값으로 적어놨다.
	 			    : "application/json; charset=UTF-8" 을 주로 사용한다.
	 	crossDomain : false,
	 	
	 	data : { "name":"kim", "pw":"123" },    -> JSON표기 내부적으로는 name=kim&pw=123 -> 쿼리스트링방식        ->결국엔 JSON으로 보내도 나가질때는 스트링포맷으로 나가진다! 그러면 서버에서는 application/json 이라면 제이슨으로 컨버팅한다. 만약에 x-www-form..으로 적혀있다면 값만 json이여도 컨텐츠타입을 글자로 읽는다. 그래서 data타입이 중요하다.
	     또는 : { "name":["kim", "hong"]} 으로 보낼수도 있다. 
	     또는 : "name=kim&pw=123" 으로 보내도된다.
	 
	 	우리가 보내는건 바로 위처럼 된contentType이고, dataType은 서버로 부터 온 응답데이터다 
	 	dataType : (xml, json, script, or html),
	 	
	 	error : function(){}, 에러가나면 무슨일해줄까?
	 	
	 	success : function(){},
	 	
	 	KEY : VAL,
	 	
	 	KEY : VAL,
			 	
	 	
	 	위 말고도 다양한 형태로 보낼 수 있다.
	 )};
	 
	 	 
	 
		 	 
 -->


<!--  ##################### 서버로 부터의 응답 String #######################  -->
<h2>초간단 AJAX <font color=red>(F12필수)</font></h2>
<form id="Str_Str_Form">
<input id="searchGubun" type="hidden" name="searchGubun" value="">
<input id="searchStr" type="text" name="searchStr"> 
<input type="button" id="AjaxBtn" value="초간단AJAX전송">
</form>
<hr><br><br><br><br><br><br><br><br><br>
<div id="resultDIV"></div>






<!--  ##################### 서버로 부터의 응답 String #######################  -->
<h2>서버로 부터의 응답 String <font color=red>(F12필수)</font></h2>
<form id="Str_Str_Form" action="/RestServlet" method="get">
<select name="searchGubun">
	<option value="title">제목</option>
	<option value="contents">내용</option>
	<option value="regid">글쓴이</option>
</select>
<input type="text" name="searchStr">
<input type="button" id="1__Str_Str_Btn" value="1.Str-Str">
</form>
<hr>







<form id="JsonStr_Str_Form" action="/RestServlet" method="get">
<select name="searchGubun">
	<option value="title">제목</option>
	<option value="contents">내용</option>
	<option value="regid">글쓴이</option>
</select>
<input type="text" name="searchStr">
<input type="button" id="2__JsonStr_Str_Btn"  value="2.JsonStr-Str">
</form>
<hr>







<form id="Json_Str_Form" action="/RestServlet" method="get">
<select name="searchGubun">
	<option value="title">제목</option>
	<option value="contents">내용</option>
	<option value="regid">글쓴이</option>
</select>
<input type="text" name="searchStr">
<input type="button" id="3__Json_Str_Btn"  value="3.Json-Str">
</form>
<hr><br><br>







<!--  ##################### 서버로 부터의 응답 JSON #######################  -->
<h2>서버로 부터의 응답 JSON <font color=red>(F12필수)</font></h2>
<form id="Str_Json_Form" action="/RestServlet" method="get">
<select name="searchGubun">
	<option value="title">제목</option>
	<option value="contents">내용</option>
	<option value="regid">글쓴이</option>
</select>
<input type="text" name="searchStr">
<input type="button" id="4__Str_Json_Btn"  value="1.Str-JSON">
</form>
<hr>







<form id="JsonStr_Json_Form" action="/RestServlet" method="get">
<select name="searchGubun">
	<option value="title">제목</option>
	<option value="contents">내용</option>
	<option value="regid">글쓴이</option>
</select>
<input type="text" name="searchStr">
<input type="button" id="5__JsonStr_Json_Btn"  value="2.JsonStr-JSON">
</form>
<hr>






<form id="Json_Json_Form" action="/RestServlet" method="get">
<select name="searchGubun">
	<option value="title">제목</option>
	<option value="contents">내용</option>
	<option value="regid">글쓴이</option>
</select>
<input type="text" name="searchStr">
<input type="button" id="6__Json_Json_Btn"   value="3.Json-JSON">
</form>
<hr>








<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	//$(function() {    });
	$("#AjaxBtn").click(  function(){
		//alert("초간단AJAX");
		var sg = $("#searchGubun").val();   //id값을 #으로.
		var ss = $("#searchStr").val();  //id값을 #으로.
		$.ajax({
			//이 버튼이 클릭되면 ajax(비동기통신)작동해라
			method : "GET",
			url      : "/RestServlet",
			data     : "searhGubun="+sg+"&searchStr="+ss,
			error    : function(myval){ console.log("이건에러" + myval); },
			success  : function(myval){ console.log("이건성공" + myval); 
			$("#resultDIV").html("<b>"+myval+"</b>")
									  }
		});
	});
	
	
	
	
	
	
	$("#1__Str_Str_Btn").click(  function(){
		alert("1");
	});
	
	
	
	
	
	$("#2__JsonStr_Str_Btn").click(  function(){
		alert("2");
	});
	
	
	
	
	$("#3__Json_Str_Btn").click(  function(){
		alert("3");
	});
	
	
	
	
	$("#4__Str_Json_Btn").click(  function(){
		alert("4");
	});
	
	
	
	
	
	$("#5__JsonStr_Json_Btn").click(  function(){
		alert("5");
	});
	
	
	
	
	
	$("#6__Json_Json_Btn").click(  function(){
		alert("6");
	});
	
</script>

</body>
</html>