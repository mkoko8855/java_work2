<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<script>
var arr = [{"empno":"7733", "ename":"smith"} , 
    	   {"empno":"7799", "ename":"king"}];


//일반반복문
for(var i=0; i<arr.length; i++){
	//console.log(arr[i]); //7733
	console.log(arr[i]["empno"]); //7733 7799

}



//배열반복문
var arr2 =[["7733", "smith"], ["7799", "king"]];
for(var i=0; i<arr2.length; i++){
	console.log(arr2[i][0]); //첫번째의 0번째와 두번째의 0번쨰 찍어줘 ->  7733 7799
}



//for each문
var arr3 =[["7733", "smith"], ["7799", "king"]];
arr3.forEach(function(val, idx){
	console.log(idx + "," + val[1]); //smith와 king을찍어준다.
});

</script>









<script>

function myprint(prm){
	console.log("myprint() 호출" + prm);
}


function myprint2(prm){
	alert("myprint2() 호출" + prm);
}

</script>



<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	$(function(){
		
		myprint("홍길동"); //출력결과 : myprint() 호출홍길동

		
			


		
		
		
		
		var arr4 =[["7733", "smith"], ["7799", "king"]]; 
		$.each(arr4, function(idx, val){ //위 스크립트문이랑 순서가 다르다!!!! 중요!
			console.log(idx + "," + val[1]); //똑같이 smith와 king을찍는다.
		}); 
		
		
		
		
		
		
		
		
		var arr5 = [{"empno":"7733", "ename":"smith"} , 
	    	        {"empno":"7799", "ename":"king"}];
		$.map(arr5, function(val, idx){
			console.log(idx + "," + val["ename"]); //ename(키로 꺼내라!) -> 똑같이 smith와 king을찍는다.
		});
		
		
		
		
		
		
		
		
		//콜백이 2개다 -> 위에꺼 function이 시작한 후, 끝나면 즉.
		//위에꺼 할꺼 다하고 나서 대기하고있다가 버튼클릭되어지면 시작해라.
		$("#myBtn").click(function(){
			myprint2("제이쿼리길동");
		});
		
		
		
		
		
		
		
		
		
		$("#myDiv").click(function(){
			myprint2("제이쿼리div");
		});
		
		
		
	});
	
		
	
	
		
	
	
	
	
	
	
	
	
</script>





</head>
<body>

<!-- myprint2 불러보자 -->
스크립트 반복문 연습<br>
<a href="#" onClick="myprint2('홍길동');">스크립트 호출</a> <!-- 누르면 마이프린트가떠야됨 -->


<!-- td태그가 클릭되어지면 불려라 -->
<table border=1 width=500 height=200><tr><td style="cursor:pointer" onClick="myprint2('홍길동');">스크립트 호출</td></tr></table>


<input type="button" id="myBtn" value="버튼 클릭">



<div id="myDiv">div클릭</div>



</body>
</html>