package com.fast.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListBasic {

	public static void main(String[] args) {
		
		 /*
		 								ArrayList
		 
		 	배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
		 	
		 	배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
		 
		 	얘는 객체이다, 배열은 인덱스로 직접 접근했지만 기능을 위해 메서드로 접근한다.
		 	
		 	인덱스를 활용하며 객체의 중복 저장을 허용한다.
		 
		 */
		
		List<String> nick = new ArrayList<>();     //<>는 제네릭이라는 개념이다. 타입 안전성을 위해 지정하는 것이다. 즉, 타입을 명시해주는 문법이다.
		//List nick = new ArrayList();			   //어레이리스트는 타입을 다 받아 저장할 수 있지만 꺼낼 때 힘들다. 오브젝트니 부모 타입의 시선으로는 자식의 기능들을 사용할 수 없기 때문.
												   //보통 리스트는 인터페이스타입으로 변수를 선언한다. (List처럼). 즉, 다형성 적용으로 객체를 생성하는 것이 일반적이다.
		
		
		
		
		//어레이리스트 사용법
		
		//String문자열을 ArrayList에 넣어보자.
		String str = "야옹이";
		System.out.println(str);
		
		
		System.out.println("---------------------------------");
		
		
		
		
		//List에 객체를 추가하는 메서드.  add(객체) : 리스트에 객체를 추가하는 메서드
		nick.add(str);		//당연 가능. 야옹이가 str에 들어갈거임
		nick.add("멍멍이");   //String타입이니 String으로 전달해야지.
		nick.add(new String("개구리")); //멍멍이랑 비슷하다. 얘도 가능.
		nick.add("짹짹이");
		nick.add("야옹이");   //ArrayList는 중복허용가능
		System.out.println(nick);
		//출력 결과 : [야옹이, 멍멍이, 개구리, 짹짹이, 야옹이]
		
		
		
		System.out.println("111111111111111111111111111111111");
		
		
		
		
		
		//List에 객체를 추가하는 메서드.  add(인덱스,객체) : 특정 인덱스에 객체를 삽입하는 메서드
		nick.add(3, "어흥이");   		 //3번인덱스에 어흥이를 추가
		System.out.println(nick);    //자동으로 하나 증가하는 것을 볼 수 있다. 배열보다 편하다.
		//출력 결과 : [야옹이, 멍멍이, 개구리, 어흥이, 짹짹이, 야옹이]
		
		
		
		
		System.out.println("22222222222222222222222222222222");
		
		
		
		
		//List에 값을 얻는 메서드.     get(인덱스) : 리스트 내부의 객체를 참조하는 메서드
		//String name = nick[3]; 이런건 배열에서 쓰는 거잖아. 리스트는 이런게 안된다.
		//리스트는 메서드를 통해 접근해야 한다.
		String name = nick.get(3);  //3번 인덱스의 값을 주세요
		System.out.println(name);
		//출력 결과 : 어흥이
		
		
		
		System.out.println("33333333333333333333333333333333");
		
		
		
		
		//List에 크기를 알아보자. 배열에는 length였다. 여기는 메서드 사용해야 한다. 		size() : 리스트의 크기를 반환할 수 있는 메서드.
		System.out.println(nick.size());
		//출력 결과 : 6
		//[야옹이, 멍멍이, 개구리, 어흥이, 짹짹이, 야옹이] = 6개 맞다.
		
		
		
		
		System.out.println("44444444444444444444444444444444");
		
		
		
		
		
		//기존의 객체를 새로운 객체로 바꾸자. 즉, 수정하자.     set(인덱스, 수정할 객체) : 리스트 내부의 객체를 수정.
		nick.set(2, "삐약이"); //2번째 인덱스가 삐약이로 바뀜
		System.out.println(nick);
		//출력 결과 : [야옹이, 멍멍이, 삐약이, 어흥이, 짹짹이, 야옹이]
		
		
		
		System.out.println("5555555555555555555555555555555");
		
		
		
		
		//값을 지워보자
		//remove(인덱스), remove(객체)  둘 중 아무거나 사용해도 된다. 인덱스모르면 객체사용하면 된다.
		nick.remove(5); //5번 인덱스 지워버리겠다.
		System.out.println(nick);
		//출력 결과 : [야옹이, 멍멍이, 삐약이, 어흥이, 짹짹이]       즉, 마지막에 있는 야옹이는 삭제가 되었고 크기가 자연스럽게 줄었다. 편하다..
		
		nick.remove(str); //야옹이 삭제해줘
		System.out.println(nick);
		//출력 결과 : [멍멍이, 삐약이, 어흥이, 짹짹이]
		
		
		
		
		
		
		
		
		
		
		//List반복문 처리
		for(int i=0; i<nick.size(); i++) {
			System.out.println(nick.get(i));   //배열에서 값을 얻어보기. get(i) 써야됨. 꺼낼 때도 메서드 이용 해야함. 주의!
		}
		
		//출력 결과 :
		//멍멍이
		//삐약이
		//어흥이
		//짹짹이
		
		
		
		
		
		
		
		
		//향상for문도 가능. (forEach)
		for(String n : nick) {
			System.out.println(n);
		}
		//출력 결과 : 
		//멍멍이
		//삐약이
		//어흥이
		//짹짹이
		
		
		
		
		
		
		
		//내가 어떠한 문자열 값이 리스트 내부에 있는지 궁금해.      contains(객체) : 리스트 내의 객체의 존재 유무를 파악하는 메서드.
		System.out.println(nick.contains("삐약이"));   //삐약이는 있으니 true, 만약 메뚜기라고 적으면 false가 뜬다.
		//출력 결과 : true
		
		
		
		
		
		
		
		
		//리스트 내부를 텅텅 비우고 싶다.        clear() : 리스트 내부 요소 전체 삭제
		nick.clear();
		System.out.println(nick);
		//출력 결과 : []
		
		
		
		
		
		
		
		
		
		//리스트가 혹시 비었니?           isEmpty() : 리스트가 비어있는지의 여부를 확인할 수 있는 메서드.   (지금우리가 비워논 상태다)
		System.out.println(nick.isEmpty());   //비었으니 true
		//출력 결과 : true
		//size() == 0 이냐 라고 물어봐도 되긴해. 
		
		
		
		System.out.println("666666666666666666666666666666666");
		
		
		
		
			//         			 #  컬렉션 객체들은 Collections의 기능을 사용할 수 있다.
			//         			    Collections는 컬렉션 객체들의 부가 기능들을 지원한다.
		
		
		//점수를 저장해볼꺼야. 리스트에.
		//먼저 변수 선언부터.
		List<Integer> score = new ArrayList<>();  //int로는 생성 안된다. 리스트는 객체들의 모음인데 int는 객체가 아닌 기본타입이다.
												  //int값을 넣을꺼면 int를 객체형태로 집어 넣어야 한다.
												  //즉, Integer로 해주자.
		
		
		
		
		//오토박싱으로 인해 그냥 숫자 집어 넣으면 알아서 포장됨
		score.add(65);
		
		
		
		//add 계속 하기 귀찮으니 한번에 때려 넣고싶다면, (한번에 객체 많이 추가하기)
		Collections.addAll(score, 78, 100, 88, 79, 100, 21, 56, 100);    //리스트값, 넣어줄 값들ㄱㄱ
		System.out.println(score);
		//출력 결과 : [65, 78, 100, 88, 79, 100, 21, 56, 100]
		
		System.out.println("777777777777777777777777777777777");
		
		
		//특정 객체가 리스트 내부에 몇개 존재하는지?    (컬렉션에서 등장 횟수 구하기)
		System.out.println("100점 학생 수 몇명? : " + Collections.frequency(score, 100));
		//출력 결과 : 100점 학생 수 몇명? : 3
		
		
		
		
		
		
		
		//최대값과 최소값
		System.out.println("최대값 : " + Collections.max(score));
		System.out.println("최소값 : " + Collections.min(score));
		//[65, 78, 100, 88, 79, 100, 21, 56, 100]
		//출력 결과 : 
		//최대값 : 100
		//최소값 : 21
		
		
		
		
		
		
		
		//sort가 아닌, 컬렉션스가 제공하는 메서드를 이용하여 정렬해보자
		//오름차순 정렬 (작은 값부터 순서대로 커지는 정렬)
		Collections.sort(score);
		System.out.println(score);
		//출력 결과 : [21, 56, 65, 78, 79, 88, 100, 100, 100]
		
		
		
		
		//내림차순 정렬 (큰 값부터 순서대로 작아지는 정렬)
		//방식이 2가지다.
		//1. 오름차순 후, 뒤집어 버리기.
		Collections.reverse(score);
		System.out.println(score);
		//출력 결과 : [100, 100, 100, 88, 79, 78, 65, 56, 21]
		
		//2. 오름차순 후, 매개 값을 하나 더 준다
		Collections.sort(score, Collections.reverseOrder());   //역순 배치
		System.out.println(score);
		//출력 결과 : [100, 100, 100, 88, 79, 78, 65, 56, 21]
		
		
		
		
		
		
		
		//두 요소의 위치를 교체 : swap(리스트, 인덱스지정 i, j)
		Collections.swap(score, 3, 7);   //3번 인덱스와 7번 인덱스 위치 교체
		System.out.println(score);
		//원래 출력 : [100, 100, 100, 88, 79, 78, 65, 56, 21]
		//출력 결과 : [100, 100, 100, 56, 79, 78, 65, 88, 21]
		
		
		
		
		
		
		
		
		//리스트 내의 요소를 무작위로 섞기 (랜덤으로 섞기)
		Collections.shuffle(score);
		System.out.println(score);
		//출력 결과 : [100, 79, 88, 21, 100, 65, 100, 78, 56]      즉, 무작위로 섞였음
		
		
		
		
		
		
		
		//원하는 값으로 초기화 시키는 것 (전체 초기화)
		Collections.fill(score, 100);
		System.out.println(score);
		//출력 결과 : [100, 100, 100, 100, 100, 100, 100, 100, 100]
		
		
		
	}
}
