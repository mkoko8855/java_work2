package com.kosta.interface1;

/*

인터페이스는 메인이 없다. 



남 퍼줄 목적이다(부모가 되려는 목적이다). 
그래서 접근 제어자는 무조건 public이다.



인터페이스를 쓰는 이유?
공통부를 사용하기 위함이다.
즉, 공통의 메서드를 모아두고 부모 역할을 하는것이 목적이다.



인터페이스란?
abstract과 마찬가지로 추상이다.
abstract은 일반메서드와 추상메서드가 둘다 올 수 있지만,
interface는 일반 메서드는 오지도 못하고 추상 메서드만!! 올 수 있다.



변수 : static붙은 변수인 상수만을 갖는다!!!!
메서드 : 추상 메서드만을 갖는다!!!!



인터페이스 (다중상속가능) : 자식인터 extends 부모인터, 부모인터2
클래스 (단일상속만가능) : 자식class extends 부모class



자식class extends 부모class implements 부모인터, 부모인터2, 부모인터3......





*/


//인터페이스 끼리의 상속은 extends 부모1, 부모2, 부모3 처럼 다중상속이 가능
public interface 인터페이스 extends 인터페이스부모1, 인터페이스부모2 { //동종끼리는 extends 
	
	// public void add() {} -> 바디가 있는 메서드는 절대 사용 불가
	// public void add();   -> 사용 가능. abstract 타이핑을 안해도 컴파일러가 public abstract void add();로 해줌. 즉, abstract안써도됨.
	// abstract 생략해도 알아서 만들어주니, 메서드는 이렇게 된다.
	public void add();
	//즉, public abstract void add(); 가 자동으로 생성되는 셈이다.
	
	
	//상수 붙여보자
	public static final double PI = 3.141592; //스태틱일때 옆으로 기운다. 볼드체로 바뀐건 전역변수에도 볼드체로 바뀔 수 있다.
						                      //인터페이스에 있는 변수나 메서드 쓸꺼면 이 Basic클래스를 상속받아야 겠지
	                                          //상속받으면 내껀데, PI는 언제 메모리올라와?
	                                          //new는 안된됐으니 static 써야 한다.
	                                          //안쓰면 컴파일러가 자동으로 static을 붙여준다.
	                                          //또한 가져다 쓸땐, 다같이 써야 하니 값 변경 불가인 final이다.
	                                          //컴파일러가 final도 자동으로 붙여주긴 한다.
}


interface 인터페이스부모1 {
	public abstract void inter1ParentMethod1(); //abstract안써도 컴파일러가 자동으로 만들어줘서 상관없음
	public abstract void inter1ParentMethod2();
}


interface 인터페이스부모2 {
	public abstract void inter2ParentMethod1();
}











