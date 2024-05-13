package com.kosta.oop;

//객체 설계용 클래스(라이브러리 클래스)는 메인 메서드를 작성하지 않습니다.
public class Pen {  //이 공간은 설계도 라는 것을 잊지 말자. 펜을 아직 만들지 않을거야.
	
	//이제 설계를 진행해보자
	//내가 만들 펜은 이러한 기능이 있어 라고 생각하고 선언하자
	
	
	//객체의 속성을 필드(멤버변수)라고 부른다.
	String color;
	int price;
	
	
	//메서드도 작성해보자, 객체의 기능을 메서드 라고 한다.
	void write() {  //매개값 안받음 (얘 인스턴스 메서드임)
		System.out.println(color + " 색 글을 씁니다.");
	}
	
	
	//메서드도 작성해보자, 객체의 기능을 메서드 라고 한다.
	void priceInfo() {
		System.out.println(color + " 색 펜의 가격은 " + price + " 원 입니다.");
	}
}
