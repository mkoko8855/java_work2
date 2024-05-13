package com.kosta.sample.json;

import java.util.HashMap;

import org.json.simple.*;
import com.fasterxml.jackson.*;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;



public class JsonTest {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("empno", "7733");
		map.put("ename", "smith");
		map.put("sal", "600");
		System.out.println(map.get("ename"));
		//자바의 맵 : {ename=smith, empno=7733, sal=600} 
		//스프링의 맵 : 
        String jsonStr = "{\"ename\":\"smith\", \"empno\":\"7733\", \"sal\":\"600\"}"; // 수정: empno와 sal 사이에 쉼표 추가

		
		//String res = obj.getString("ename");
		JSONParser parser = new JSONParser();
		//JSONObject obj = new JSONObject();
		
		
		//parser.parse(jsonStr); //얘가 Object를 리턴한다.
		//근데 맵으로 바꾸고 싶은거니
		HashMap<String, String> map2 = new HashMap<String, String>(); //맵으로바꿨다.
		try {
			map2 = (HashMap<String, String>)parser.parse(jsonStr); //맵으로 바꿨으니 꺼내자 -> 맵으로 파싱한 것이다.
			System.out.println(map2);
			//String a = (String)map2.get("ename"); //제네릭 써서 사용해보자
			String a = map2.get("ename");
			String b = map2.get("empno");
			String c = map2.get("sal");
			System.out.println(a + "," + b + "," + c);
			
			
		} catch (ParseException e) {
			System.err.println("스트링을 map으로 바꾸다 에러남");
			e.printStackTrace();
		}
		
		
		
		
		
		//이번엔 Object를 이용해서 바꿔보자
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject)parser.parse(jsonStr);
			String mapToStr = obj.toJSONString(map2); //맵을 넣어서 스트링을 바로 받을수도있다. 위 map2 객체는 해쉬맵이니 글씨로 받나 확인하자
			System.out.println(mapToStr);
			
			
		    mapToStr = obj.toString();
		    System.out.println(mapToStr);
		    
		    
		    mapToStr = obj.toJSONString();
		    System.out.println(mapToStr);
		    
		    
		    //toString과 toJSONString과의 차이점은?
		    
		    
		} catch(ParseException e) {
			System.err.println("스트링 map convert에러");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
