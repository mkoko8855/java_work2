package com.fast.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {

	public static void main(String[] args) {
		
		 /*
		 	MAP이란? 두 개의 객체를 한 쌍으로 저장한다. 내가 무엇을 key로, value로 할지 정하면 된다.
		 	
		 	MAP도 인덱스는 없다.
		 	
		 	key 와 value 가 한 세트를 이루는 자료구조이다.
		 
		 	key 값을 통해 value를 참조하는 방식이다.
		 	
		 	key는 중복 저장을 허용 하지 않는다. 
		 	
		 	
		 	
		 */
		
		
		
		
		//Map은 키와 밸류가 한 쌍을 이루기 때문에 멀티 제네릭을 설정(타입을 2개 해줘야 된다는 말)
		//연습이니 둘다 String으로주자. 
		Map<String, String> map = new HashMap<>();
		
		
		
		
		//Map에 데이터를 추가하는 메서드 : put(Key,value)
		map.put("멍멍이", "김철수");  
		map.put("야옹이", "홍길동");  
		map.put("짹짹이", "박영희");  
		System.out.println(map);
		//출력 결과 : {멍멍이=김철수, 야옹이=홍길동, 짹짹이=박영희}      >    맵의 크기는 3이다. 콤마로 구분하자.
		
		
		

		
		//중복
		//Map은 Key의 중복 저장을 허용하지 않는다. 그러나 value는 중복 가능이다.
		//만약 중복 Key를 사용하여 put을 호출하면 value만 수정된다.
		map.put("멍멍이", "김뽀삐");  //key중복
		map.put("어흥이", "홍길동");  //value중복
		System.out.println(map);  
		//{멍멍이=김철수, 야옹이=홍길동, 짹짹이=박영희}
		//{어흥이=홍길동, 멍멍이=김뽀삐, 야옹이=홍길동, 짹짹이=박영희}
		//총 5개불렀지만 중복을 시켰기에 기존의 있던 key의 값에 따른 value가 수정이 되었다.
		
		
		
		
		
		
		//Map 내부에 key의 존재 유무를 확인하는 메서드 : ContainsKey(key)
		System.out.println(map.containsKey("어흥이"));
		//출력 결과 : true
		System.out.println(map.containsKey("메렁이"));
		//출력 결과 : false
		
		
		
		
		
		
		//Map 내부의 값을 참조하는 법 : get(key)
		//containskey로 있는지 없는지 확인하고 get을 사용해야 null을 안받을 수 있다.
		String name = "멍멍이";
		if(map.containsKey(name)) {  //확인을 먼저 하는거를 매우 권장.
			System.out.printf("%s의 별명을 가진 학생은 %s 입니다.\n", name, map.get(name));
		} else {
			System.out.println("그런 별명을 가진 학생은 없어요");
		}
		//출력 결과 : 멍멍이의 별명을 가진 학생은 김뽀삐 입니다.
		
		
		
		
		
		
		
		
		
		//map의 크기를 확인하는 메서드 : size()
		System.out.println("map의 크기 : " + map.size());
		//출력 결과 : map의 크기 : 4
		
		
		
		
		
		
		
		
		//map에서 key들만 추출하는 메서드 : KeySet()
		//모든 key들을 Set에 담아서 반환한다.
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		//출력 결과 :
		/*
		어흥이 : 홍길동
		멍멍이 : 김뽀삐
		야옹이 : 홍길동
		짹짹이 : 박영희
		*/
		
		
		
		
		
		
		
		
		//map의 객체를 삭제 : remove(key)
		//키가 삭제되면 밸류도 함께 지워진다.
		map.remove("야옹이");   //야옹이라는 키를 줬다. 그럼 야옹이와 같이 맵핑되어있는 홍길동도 지워 질 것이다.
		System.out.println(map);
		//출력 결과 : {어흥이=홍길동, 멍멍이=김뽀삐, 짹짹이=박영희}
		
		
		
		
		
		
		
		
		
		//다 지우고 싶다?
		map.clear();
		System.out.println(map);
		//출력 결과 : {}
		
		
		
		
	}
}
