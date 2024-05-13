package com.fast.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBasic {

	public static void main(String[] args) {
		
		 /*
		 	Set
		 	
		 	셋이란? 집합을 구현해 놓은 인터페이스 이다.
		 	
		 	가장 큰 특징은, 요소로 같은 값이 들어오는 것을 허용하지 않는다. (중복방지. 즉, 중복허용X)
		 	
		 	
		 	Hash
		 	
		 	Hash란? 어떠한 값을 넣었을 때 전혀 예측하지 못할 값이 생성되어야 하는 알고리즘.
		 	
		 	예측 할 수 없는 값을 이용하기 때문에 정렬이 불가능
		 	
		 	생성된 값으로 원래 값을 찾는 것도 불가능에 가깝다.
		 	
		 	다시 원래 값으로 돌아갈 수 없는 단방향성(앞으로만가는) 알고리즘.
		 	
		 	즉, 속도가 빠르고 보안성이 뛰어난 알고리즘이며,
		 	
		 	객체의 주소 값을 할당 하거나 암호화 알고리즘에서 많이 사용된다.
		 */
		
		
		Set<String> set = new HashSet<>();
		
		//객체를 저장 : add(객체)
		//셋은 인덱스가 없다. 순서대로 들어가는 구조가 아니다. 그냥 순서없다. 마구잡이다.
		set.add("JAVA");
		set.add("JSP");
		set.add("Spring");
		set.add("Oracle");
		Collections.addAll(set, "Mysql", "JAVA");
		System.out.println(set);
		//출력 결과 : [JAVA, JSP, Mysql, Spring, Oracle]  //순서가 안지켜진다! 즉, 마구잡이다. 중복은 허용 안되니 알아서 걸러준다.
		
		
		
		
		
		
		//셋에 데이터가 몇개 들어가있는지? 셋의 크기를 확인해보자 : size()
		System.out.println("set의 크기 : " + set.size());
		//출력 결과 : set의 크기 : 5

		
		
		
		
		
		
		//셋 데이터 꺼내기(읽기) 
		//참고로 셋은 get은 없다. list는 있는데..
		//get+인덱스 하면 되는데 셋은 인덱스가 없으니..
		//셋은 인덱스가 없으니 메서드를 이용해서 객체를 얻는게 아니라
		//반복자(Iterator)를 통해서 요소를 하나씩 꺼내야 한다.
		//반복자 객체는 set 인터페이스가 제공하는 iterater()를 호출하여 얻어온다.
		Iterator<String> iter = set.iterator();
		//Iterater 객체에 메서드 : next()를 통해 내부 요소를 하나씩 꺼낼 수 있다.
		//next() 메서드를 요소의 개수보다 많이 호출하게 되면 NoSuchElement 라는 예외가 발생한다.
		//요소의 개수 만큼만 불러야 된다.
		//hasNext() > 반복자가 가지고 있는 객체를 더 가지고 올 수 있는지의 여부를 확인하는 메서드이다.
		//이 메서드를 통해 Next()를 호출 해야 한다.
		System.out.println(iter.next());
		//출력 결과 : JAVA
		System.out.println(iter.next());
		//출력 결과 : JSP
		System.out.println(iter.next());
		//출력 결과 : Mysql
		//즉, 출력 할 때마다 요소가 바뀌면서 나온다.
		
		
		//그러나 남발하면 안되니 hasNext를 사용해야 한다. (꺼내올 데이터가 없다면 false가 나온다)
		
		
		//반복을 통해 셋에 있는 요소를 전부 다 꺼내보자
		while(iter.hasNext()) {					//더이상 꺼낼 게 없으면 반복문 종료하면 되니 true써도되는데
			System.out.println(iter.next());	//hasNext로 false가 뜨면 꺼낼 것이 없다는 것이다.
		}
		
		
		System.out.println("-----------------------------------------------");
		
		
		
		//근데 더 쉬운 방법이 있다. 향상된for문. 
		for(String s : set) {
			System.out.println(s);
		}
		//출력 결과도 똑같다
		//JAVA
		//JSP
		//Mysql
		//Spring
		//Oracle
		//셋은 원하는 것을 하나 꺼낼 수는 없다. 직접 반복문 돌려야 한다. 
		
		
		
		
		
		
		//set에서 객체를 삭제 : remove(객체).  (리스트는 인덱스건 객체건 아무거나 줘도 되는데 셋은 인덱스가 없다)
		set.remove("JSP");
		System.out.println(set);
		//출력 결과 : [JAVA, Mysql, Spring, Oracle]
		
		
		
		
		
		
		
		//set 비우기
		set.clear();
		System.out.println(set);
		//출력 결과 : []
		
		
		
	}
}
