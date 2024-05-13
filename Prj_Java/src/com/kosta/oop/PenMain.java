package com.kosta.oop;

public class PenMain {

	public static void main(String[] args) {
		
		
		/*
		 	설계도에 작성한 속성과 기능을 사용하려면
		 	반드시 실체(객체)를 생성해야 한다.
		 	
		 	클래스만 제작된 채로는 아무 기능도 수행할 수 없습니다.
		*/
		
		
		//객체 생성 문법 : 클래스타입 변수명 = new 클래스이름();
		Pen redPen = new Pen();   //이러면 힙 존에 객체가 생성된다!
		
		//새로운 펜도 하나 더 만들어보자
		Pen bluePen = new Pen();
		
		//새로운 펜을 하나 더 만들어보자
		Pen blackPen = new Pen();
		
		//주소를 참조하여 객체를 찾아가자
		//즉, 참조 연산자(.)를 통해 객체로 접근 한 뒤
		//속성을 지정하고 기능을 사용할 수 있다.
		redPen.color = "빨강";
		redPen.price = 500;
		//이제 값을 세팅 했으니 메서드 호출 해보자
		
		//새로운 펜인 블루펜에 접근하자
		bluePen.color = "파랑";
		bluePen.price = 600;
		
		//새로운 펜인 블루펜에 접근하자
		blackPen.color = "검은";
		blackPen.price = 700;
		
		//메서드 호출
		redPen.write();
		redPen.priceInfo();
		//출력 결과 : 빨강 색 글을 씁니다. 빨강 색 펜의 가격은 500원 입니다.
		
		//새로운 펜인 블루펜에 대해 메서드 호출하자.
		bluePen.write();
		bluePen.priceInfo();
		//출력 결과 : 파랑 색 글을 씁니다. 파랑 색 펜의 가격은 600 원 입니다.
		
		//새로운 펜인 블루펜에 대해 메서드 호출하자.
		blackPen.write();
		blackPen.priceInfo();
		//출력 결과 : 블랙 색 글을 씁니다. 블랙 색 펜의 가격은 700 원 입니다.
	} 
}
