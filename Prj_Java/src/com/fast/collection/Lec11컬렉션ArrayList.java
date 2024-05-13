package com.fast.collection;

import java.util.ArrayList;
import java.util.List;

public class Lec11컬렉션ArrayList {

	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		//ArrayList가 갖고있는 모든 메서드는 list.() 으로 접근이 가능하다.
		
		list.add(1);
		list.add("abc");
		list.add(10);
		list.add('A');
		System.out.println(list); //출력결과 : [1, abc, 10, A]
		System.out.println(list.size()); //4
		
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		} //출력결과 : 1, abc, 10, A
		
		
		
		//String으로 바꾸고 배열을 써본다면?
		System.out.println("====================================");
		String[] strArr = new String[] {"abc", "10", "A", "def"};
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i] + " ");
		} //출력결과 : 1, abc, 10, A
		
		
		
		
		
		
		//제네릭
		List<String> list2 = new ArrayList<>();
		for(String n : list2) {
			System.out.println(list2);
		} //출력결과 : 1, abc, 10, A
		
		
		//일반for문으로는
		for (int i = 0; i < list2.size(); i++) {
		    System.out.println(list2.get(i));
		}
		
		
		System.out.println("************************************");
		
		
		list.add(3, "def");       //3번째 인덱스에 def 추가
		System.out.println(list); //출력결과 : [1, abc, 10, def, A]
		System.out.println(list.get(3)); //출력결과 : def
		
		
		
		//수정하는법 -> UPDATE list SET col='zzz' WHERE SEQ=0;
		list.add(0, "zzz"); //0번째 인덱스를 "zzz"로 바꿔라
		System.out.println(list);
		//출력결과 : [zzz, 1, abc, 10, def, A]
		
		
		
		//지우기
		list.remove(0); //방금 바꾼 zzz가 첫번째인덱슨데, 이거 지움
	    //list.remove("10"); 안됨. 우리가 정수형 10을 넣어서그럼
	    //그럼 어떻게..?
	    list.remove(Integer.valueOf(10));
		System.out.println(list);
		
		
		
		list.indexOf("def");
		int idx = list.indexOf("def"); //이렇게 써서
		System.out.println(idx); //이렇게 해도 되고
		System.out.println(list.indexOf("def")); //아님이렇게~ 현재 def의 위치(index)는 3번째다.
		
		
	}

}
