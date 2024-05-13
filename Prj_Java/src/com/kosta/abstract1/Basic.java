package com.kosta.abstract1;

/*
abstract 왜쓸까?
구조적 -> 다른 클래스들이 부모클래스의 자손으로 관리가 되어질 필요가 있는 경우에 사용한다.
기능적 -> 다른 클래스들의 부모클래스에서 제공되는 공통 기능의 메서드(노말메서드같이)를 공통으로 사용하되, 
        일부 메서드(absMethod()같이)는 각자가 구현해야 되는 경우
*/




/*
abstract(추상, 미완성)
- 클래스 : abstract 메서드가 있을 '수'도 있다. 또한, new(인스턴스생성)를 못함!!
클래스앞에 abstract 놓으면됨 -> public abstract class Basic 처럼

- 메서드 : 바디가 없는 메서드


메서드 사용하고 싶으면 일반 메서드는 자식new.부모일반메서드(),
메서드 사용하고 싶으면 추상 메서드는 반드시 오버라이딩 자식new.자식오버라이딩()


*/

public abstract class Basic {

	public abstract void absMethod(); // 추상메서드다. 바디는 상속받는애가 구현한다.
	
	public abstract void absMethod2(); //이렇게 추상메서드들이 많으면

	public abstract void absMethod3(); //자식클래스에서 전부

	public abstract void absMethod4(); //완성 시켜야 한다
	
	
	public void nomalMethod() { 
		// 메인메서드에서 호출하기위해 new안되니까 static붙여보자
		// 근데 공통부가 아닐땐? static붙을이유는딱히.다시 static 빼자
		// 그럼 상속을 이용해야겠지 -> Basic클래스의 자손을만들자 -> Basic2 다.
		System.out.println("부모에 있는 노말메서드!");
	}

	

	public static void staticMethod() {
		System.out.println("부모에 있는 스태틱 메서드!");
	}

	
	public static void main(String[] args) {
		// Basic o = new Basic(); 이거불가능.
		// o.nomalMethod(); 당연히안됨
		// 클래스가 abstract이라는 것은 new를못함!

		// nomalMethod(); //nomalMethod 메서드에 static을 붙이면 된다!
		
		
		//쓰겠다 안쓰겠다 여부는 자식에서 사용한다.
		//쓰겠다 안쓰겠다 여부는 자식에서 사용한다.
		//쓰겠다 안쓰겠다 여부는 자식에서 사용한다.

		
		
	}

}
