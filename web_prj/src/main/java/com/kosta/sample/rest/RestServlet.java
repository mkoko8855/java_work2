package com.kosta.sample.rest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kosta.boardtest.BoardVO;


@WebServlet("/RestServlet")
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RestServlet() {
        super();
    }

    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		
		
		
		
		Gson gson = new Gson();
		String pagecode = request.getParameter("pagecode");
		
		
		
		
		if(pagecode.equals("R001")) {
			String searchGubun = request.getParameter("searchGubun");
			String searchStr   = request.getParameter("searchStr");
			System.out.println(searchGubun + "," + searchStr); 
			//title,d
			//String responseStr = "이건 서버가 보낸 메세지";
			
			
			
			//리스트는 제이슨형식으로 보내보자
			ArrayList<BoardVO> list = new ArrayList<BoardVO>(); //리스트에 VO담아서 보내는 연습해보자
			BoardVO bvo = new BoardVO();
			bvo.setTitle("aaa");
			bvo.setRegid("kim"); //[{"title" = "aaa", "regid" = "kim"}}] 형태가 되었다.
			list.add(bvo);
			
			bvo = new BoardVO(); //[{"title" = "bbb", "regid" = "hong"}}] 형태가 되었다.
			bvo.setTitle("bbb");
			bvo.setRegid("hong");
			list.add(bvo);
			
			
			
			//우린 객체를 글자로만 바꿀 수 있으면 된다.
			String gsonString = gson.toJson(list); //리스트를 글자로 바꿔라
			System.out.println(gsonString + "," + gsonString.getClass());
			//[{"seq":0,"title":"aaa","regid":"kim"},{"seq":0,"title":"bbb","regid":"hong"}],class java.lang.String
			PrintWriter out = response.getWriter(); //리다이렉트 포워드처럼 어디로 가라 가 아니라, 응답을 주라고 했다.
			out.println(gsonString); //이게 lec_rest.jsp의 myval 변수로 들어간다.
		}
		
		
		
		
	}

	
	
	//2번일때는 제이슨모양으로와서 스트링으로 나가고
	//3번은 진짜 제이슨으로 와서 스트링으로 나갔기 때문에 response를 setContentType을썼다.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		Gson gson = new Gson();

		String pagecode = request.getParameter("pagecode");
		
		//003은 002와 다르게, 키:밸류 를 잘라내서 커렉터를 이용해서 키옆에밸류 붙여서 완성된 string문장으로 내뱉는다.
		//002도 003도 제이슨 모양의 String이 온다는 것이다.
		if (pagecode.equals("R003")) {
			response.setContentType("text/html;charset=UTF-8");
			String jsonStr = request.getReader().lines().collect(Collectors.joining());
			System.out.println(jsonStr + "," + jsonStr.getClass());
			
			// obj  : JSON.stringify({"title":"aaaaatitle","regid":"hong"});
			// str  : "{"title":"aaaaatitle","regid":"hong"}"
			// fromjson : {"title":"aaaaatitle","regid":"hong"} 의 형태로 ->  fromjson을 이용하여 객체로 받을 것이다.
			BoardVO bvo = gson.fromJson(jsonStr, BoardVO.class);
			System.out.println(bvo.getTitle()); 
			
			PrintWriter out = response.getWriter();
			out.print("R003 응답 ok1");
			out.print(bvo.getTitle());
			
			
		} else if (pagecode.equals("R002")) {
			//키 하나 잡고 제이슨데이터를 묶어서 보내기
			response.setContentType("text/html;charset=UTF-8");
			String jsonStr = request.getParameter("MY_JSONKEY");
			System.out.println(jsonStr + "," + jsonStr.getClass());
			
			PrintWriter out = response.getWriter();
			out.print("R002 응답 OK");
			
			
			//결국 R001,R002,R003 셋다 스트링으로 오고가고한것임 
		
		} else if(pagecode.equals("R004")) {
			response.setContentType("application/json; charset=UTF-8");
			
			HashMap map = new HashMap<String, String>();
			map.put("status", "200");
			map.put("message", "R004 응답 ok");
			//위 put한 맵객체를 내보낼꺼니 gson이용하자
			String jsonStr = gson.toJson(map); //얘가 제이슨 모양의 스트링을 만들어준다.
			//String jsonStr = "{\"status\":\"200\", \"message\":\"R004 응답 ok\"}"; //즉, 이런 모양이 된다. 이걸 내보낼꺼야
			PrintWriter out = response.getWriter();
			out.print(jsonStr);
			
			
			
			
		} else if(pagecode.equals("R005")) {
			//들어올 데이터는 이렇게 온다 -> data : "MY_JSONKEY=" + JSON.stringify(objData), -> 겟파라미터로 끄집어내자
			
			response.setContentType("application/json;charset=UTF-8");
			String jsonStrParam = request.getParameter("MY_JSONKEY");
			System.out.println(jsonStrParam + "," + jsonStrParam.getClass());
				
				
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("status", "200");
			map.put("message", "R005 응답 ok");
			String jsonStr = gson.toJson(map);
			//String jsonStr = "{\"status\":\"200\", \"message\":\"R004 응답 ok\"}";
			PrintWriter out = response.getWriter();
			out.print(jsonStr);
			
			
			
			
			
		} else if (pagecode.equals("R006")) {
			response.setContentType("application/json;charset=UTF-8");
			
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("status", "200");
			map.put("message", "R006 응답 ok");
			String jsonStr = gson.toJson(map);
			//String jsonStr = "{\"status\":\"200\", \"message\":\"R004 응답 ok\"}";
			PrintWriter out = response.getWriter();
			out.print(jsonStr);
		}
		
		
		
	}

}
