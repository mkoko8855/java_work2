package com.kosta.sample.json;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;

public class APIGSON {

	public static void main(String[] args) {
		
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("empno", "7733");
		map.put("ename", "simth");
		
		System.out.println(map.get("ename"));
		System.out.println(map + "," + map.getClass());
		
		//어떤 객체를 집어넣으면 글자로 바꿔라
		Gson gson = new Gson();
		String mapString = gson.toJson(map);
		System.out.println(mapString + "," + mapString.getClass());
		
		
		//반대로 스트링을 객체로 바꿔라라면?
		HashMap res = gson.fromJson(mapString, HashMap.class);
		System.out.println(res + "," + res.getClass());
	
	
		
		
		//--------------------------------------------
		//객체를 글자로, 즉 -> 스트링으로 바꿔주세요
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		list.add(map);
		
		String mapString2 = gson.toJson(list);
		System.out.println(mapString2 + "," + mapString.getClass());
		
		//바뀐걸 다시 원복
		ArrayList res2 = gson.fromJson(mapString2, ArrayList.class);
		System.out.println(res2 + "," + res2.getClass());
		
	
	
	
	}
	
	
	
		
	
	
	
	
	
	
	
	
	

}
