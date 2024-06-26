package com.fast.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lec11컬렉션복합2 {
	

	
	
	public static void main(String[] args) {

		// {seq="1", title="제목1", rdate="2024-01-01", regid="kim"}
		// {seq="2", title="제목2", rdate="2024-01-01", regid="kim2"}
		// 리스트에서 맵을 담아보자

		final int DATA_ROWS = 15;
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		for(int i=0; i<=DATA_ROWS; i++) {
		HashMap map = new HashMap<String, String>();
		map.put("seq", ""+i);
		map.put("title", "제목"+i);
		map.put("rdate", "2024-01-01");
		map.put("regid", "kim"+i);
		list.add(map);
	}
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			String seq = list.get(i).get("seq");
			String title = list.get(i).get("title");
			String rdate = list.get(i).get("rdate");
			String regid = list.get(i).get("regid");
			System.out.println(seq + "\t" + title + "\t" + rdate + "\t" + regid);
		}
		
		

		
		
		
		
		
		
		
		//잘못된 내코드
//		ArrayList<Map<String, Object>> list = new ArrayList<>();
//		for (int i = 0; i < 4; i++) {
//			Map<String, Object> map = new HashMap<String, Object>();
//			((Map<String, Object>) map).put("seq", "1");
//			((Map<String, Object>) map).put("title", "제목1");
//			((Map<String, Object>) map).put("rdate", "2024-01-01");
//			((Map<String, Object>) map).put("regid", "kim");
//			list.add(map);
//		}
//		System.out.println(list.size()); //4
//		for(int i=0; i<list.size(); i++) {
//			String seq = (String) list.get(i).get(0);
//			String title = (String) list.get(i).get(1);
//			String rdate = (String) list.get(i).get(2);
//			String regid = (String) list.get(i).get(3);
//
//		}
	}

}
