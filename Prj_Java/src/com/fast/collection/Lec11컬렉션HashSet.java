package com.fast.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Lec11컬렉션HashSet {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		// = Set<String> hs = new HashSet<>();
		
		hs.add("abc");
		hs.add(10);
		hs.add('A');
	  //hs.add('A'); 해쉬셋은 중복이 불가하다.
		System.out.println(hs); //출력결과 : [A, abc, 10]
		
		//해쉬셋은 순서보장이 없다. 그냥 집어넣어들어간다. 또한 중복이 불가하다.
		
		
		
		hs.remove('A');
		System.out.println(hs); //[abc, 10] -> 'A'를 지운다.
		
		
		
		//list채로 담아서 생성자 생성
		//형변환 : Set을 ArrayList로 쓴다면? -> 타입에 맞게 캐스팅해도 되고, API로도 제공이 된다. to..
		ArrayList list = new ArrayList(hs);
		System.out.println(hs); //[abc, 10]
		System.out.println(list.get(0).getClass()); //class java.lang.String
		
		
		//Hash Set은 수정(List에선 set)명령이 없다
		//지우고 다시 넣어야 함
		list.clear();
		Collections.addAll(list, "aaa", "bbb", "ccc");
		System.out.println(list); //출력결과 : [aaa, bbb, ccc]
		
		
		
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //숫자만담을래~
		list2.add(10);
		list2.add(20);
		list2.add(30);
		Integer res2 = list2.get(0);
		System.out.println("제네릭사용(캐스팅생략) " + res2);
		//출력결과 : 제네릭사용(캐스팅생략) 10
	
		
		
	}

}
