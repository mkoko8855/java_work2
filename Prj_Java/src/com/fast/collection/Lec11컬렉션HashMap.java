package com.fast.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lec11컬렉션HashMap {

	public static void main(String[] args) {
		/*
		
		
		MAP도 인덱스는 없다.
	 	key 값을 통해 value를 참조하는 방식이다.
	 	key는 중복 저장을 허용 하지 않는다. 
	 	
	 	key로 꺼낸다.
		 	
		바꾸는건 replace
		키값 다꺼내는거 keyset()
		모든값다꺼내는거 values()
	 	*/
		
		//HashMap map = new HashMap();
		Map<String, Object> map = new HashMap<String, Object>(); 
		//키는 스트링, 값(우리가 아래 int string char 다넣엇으니)은 오브젝트
		
		//제네릭은 키말고 값들이 같으면 타입캐스팅 안해도됨
		
		//제네릭이란?
		//클래스, 메서드 등에서 사용할 데이터 타입을 (타입을 미리 지정)하는 방법
		//컴파일 시 사전 타입 체크.
		//제네릭은 타입 안정성, 코드가독성, 런타임 시 오버헤드 감소 의 장점이 있다.
		//컴파일 시, 컴파일러가 구동 전에 타입을 체크한다.
		
		map.put("name","abc");
		map.put("age", 10);
		map.put("score",'A');
		map.put("score", 'B'); //동일한 key값이면 B로 덮어버린다.
		
		System.out.println(map);
		//출력결과 : {score=A, name=abc, age=10}
		
		
		
		
		//타입이 궁금할수도있잖아?
		System.out.println(map.get("name").getClass());
		//출력결과 : class java.lang.String

		
		
		
		
		
		
		System.out.println(map.containsKey("10")); //존재확인 -> false
		
		
		
		
		
		//수정
		map.put("name", "zzz"); //수정하는 법 -> 덮어버리기!
		
		
		
		
		//수정2
		map.replace("name", "ddd"); //zzz가 ddd로바뀜
		
		
		
		
		
		//String age = (String) map.get("age"); //꺼낼 수 있는 get.
		System.out.println(map.get("age")); //10
		//String str = (String)map.get("name");
		//System.out.println(str);
		
		
		
		
		
		
		
		String name = "yammy";
		if(map.containsKey(name)) {  
			System.out.println(map.get(name));
		} else {
			System.out.println("그런 별명을 가진 학생은 없어요");
		}
		
		
		
		
		
		

		System.out.println("map의 크기 : " + map.size()); //3
		
		
		
		
		
		
		
		//모든 키들을 셋에 담아서 반환할래
		Set<String> keys = map.keySet();
		for(String a : keys) {
			System.out.println(a + " : " + map.get(a)); //꺼내기
		}
		
		/*
			 출력결과 : 
			 score : B
			 name : ddd
			 age : 10 
	    */
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
