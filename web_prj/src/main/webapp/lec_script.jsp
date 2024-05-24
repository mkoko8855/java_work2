<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

	<style>
		p {
			color : red;
			font-weight : bold;
		}
	</style>



	<!-- 자바스크립트의 임포트는 다음과 같다 -->
	<script src="js/scripts.js"></script>
	<!-- <script src="webapp/js/scripts.js"></script> 도 가능 -->
	
	<!-- 근데 우린 제이쿼리 라이브러리가 있어야 한다. 제이쿼리 cdn을 구글검색하자 -->
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	
	<!-- 웹앱의 my.js에서 메서드하나만든거 임포트해줘야지 -->
	<script src="js/my.js"></script>

	<!-- 웹앱의 my.css 임포트 -->
    <link href="css/styles.css" rel="stylesheet" />




	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<script>
	
	//public int myprint(int a, int b){sys...}
	function myprint(a,b){ //myprint를 호출하는건 body부에 가자.
		alert(a+b);
		console.log(a+b);
	}
	</script>
	
	
	
	<!-- 제이쿼리($) 시작 -> style태그써야함 -->
	<script>
	//$(document).ready(function() { //document.ready는 생략가능
		
	//});
	
	
	//<태그>를 이용하여 값바꾸기
	//$(function() { //document.ready를 이렇게 생략해서 써도 된다.
	//	$("p").text("이렇게 바꿨어");
	//});
	
	
	//id값을 이용하여 값바꾸기
	//$(function(){
	//	$("#PTAG_ID").text("ID값을 이용하여 변경했어!");
	//})
	
	
	//class값을 이용하여 값바꾸기
	$(function(){
		$(".PTAG_CLASS").text("CLASS값을 이용하여 변경했어!");
	})
	
	
	
	//form태그 변경하기 -> id값 가져오자
	//$(function(){
	//	$("#uname1").val("hong으로 바꿔라!");
	//})
	
	
	//form태그 요소 제어
	//$(function(){
	//	$(".uname").val("hong으로 바꿔라@"); 
	//	
	//	var msg = $("#seq").val(); //seq값 가져오기
	//	alert(msg);
	//	
	//	$("input[name='uname']").val("hong"); //name값을 이용해서 값바꾸기
	//})
	
	
	//form태그 요소 제어
	//$(function(){
	//	if $("#uname").val() == null) { //uname의 value가 null이 아니면
	//		alert("아이디 입력하세요");	
	//		$("#uname").focus();
	//}  else if($("#passwd").val() == null){
	//		alert("비밀번호 입력하세요");
	//		$("#uname").focus();
	//
	//}
//})
	
	$(function(){
		$("#regbtn").click(  function(){
			if ($("#uname").val() == "") {
				alert("아이디 입력하세요");
				$("#uname").focus();
				return false;
			} else if ($("#passwd").val() == "") {
				alert("비번 입력하세요");
				$("#passwd").focus();
				return false;
			}
			
			$("#loginForm").attr("method","post");
			$("#loginForm").attr("action","/BoardServlet");
			$("#loginForm").submit();
			return true;
			
		});
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	</script>
	
	
</head>





<body>
	<!-- 
	myprint를 호출할때 자바에서는
	lec_script ls = new lec_script();
	ls.myprint(5,3);
	 -->
	
	<!--이렇게 호출해도되고-->
	<a href="#" onClick="myprint(5,3)">내부 js 클릭1</a>
	
	
	<!--이렇게 호출해도된다 -->
	<div onClick="myprint(5,3)">내부 js 클릭2</div>
	
	
	<!-- 웹앱의 my.js에서 메서드하나만들었다. 그러나 임포트해야지 -->
	<a href="#" onClick="myjsPrint()">외부 my.js 클릭3</a>
	
	
	
	<!-- form태그 요소 제어 -> form태그에 name값이 들어가야 한다. -->
	<form method="post"> method action
		<input type="hidden"   name="seq"    id="seq"    class="seq"   value="12345">
		<input type="text"     name="uname"  id="uname"  class="uname">
		<input type="password" name="passwd" id="passwd" class="passwd">
		<input type="button"   name="regbtn" id="regbtn" class="regbtn" value="가입">
	</form>
	
		
		
		
		
		
	
	<!-- id는 고유한 값이어야 한다. -->
	<p id="PTAG_ID">제이쿼리로 이 문구 바꿔볼래?</p> <br>
	
	<!-- class가 동일하기 때문에 둘다 바뀐다. -->
	<p class="PTAG_CLASS">aaaa</p> <br>
	<p class="PTAG_CLASS">bbbb</p> <br>
	
	
	
	
	

	
</body>
</html>